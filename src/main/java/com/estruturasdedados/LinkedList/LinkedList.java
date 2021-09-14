package com.estruturasdedados.LinkedList;

import com.estruturasdedados.Stack.Node;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    boolean isEmpty(){return this.head == null ? true: false;}

    int size(){
        int cont = 0;
        Node<T> aux = head;
        while(aux.getRef()!=null){
            aux = aux.getRef();
            cont++;
        }
        return cont;
    }

    Node<T> getNode(int index){
        Node<T> aux = head;
        Node<T> aux2 = null;
        if(index >= size()){
            System.out.println("Não existe tal índice");
            return null;
        }
        for (int i = 0; i <= index; i++) {
            aux2 = aux;
            aux = aux.getRef();
        }
        return aux2;
    }

    public T get(int index){
        return getNode(index).getValue();
    }

    void add(int index, T valor) {
        int cont = 0;
        Node<T> aux;
        Node<T> node = new Node<>(valor);
        if(this.isEmpty()){
            head = node;
            return;
        }else{
            //Contador precisa começar em 1, pois aux começa adiantado (apontando para head for do while)
            int count = 1;
            aux = head;
            while(aux.getRef() != null && count < index){
                aux = aux.getRef();
                count++;
            }
            node.setRef(aux.getRef());
            aux.setRef(node);
        }
    }
    //Observe-se que, para excluir um nó da lista, basta desvincular sua referência de entrada
    //Mesmo que ele continue apontando para um nó da lista, mas ninguém aponta para ele
    //Ele está fora da lista
    public T remove(int index){
        Node<T> nodeToRemove = this.getNode(index);
        if(index == 0){
            head = nodeToRemove.getRef();
            return nodeToRemove.getValue();
        }
        Node<T> nodeAnterior = getNode(index - 1);
        nodeAnterior.setRef(nodeToRemove.getRef());
        return nodeToRemove.getValue();
    }

    @Override
    public String toString() {
        Node<T> aux = head;
        String str = "-------------\n";
        str += "LinkedList\n";
        str += "-------------\n";
        while(aux!=null){
            str += "{" + aux.getValue() + "}\n";
            aux = aux.getRef();
        }
        return str;
    }
}
