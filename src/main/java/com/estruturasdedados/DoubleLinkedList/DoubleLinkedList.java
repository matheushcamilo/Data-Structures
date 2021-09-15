package com.estruturasdedados.DoubleLinkedList;


public class DoubleLinkedList<T> {

    private NodeDoubleLinkedList<T> head = null;
    private NodeDoubleLinkedList<T> tail = null;

    public NodeDoubleLinkedList<T> getHead() {
        return head;
    }

    public NodeDoubleLinkedList<T> getTail() {
        return tail;
    }

    int size(){
        int length = 0;
        if(isEmpty()){
            return length;
        }
        NodeDoubleLinkedList<T> aux = head;
        length = 1;
        while(aux.getNoProximo()!=null){
            aux = aux.getNoProximo();
            length++;
        }
        return length;
    }
    boolean isEmpty(){
        return head == null;
    }

    NodeDoubleLinkedList<T> getNode(int index){
        NodeDoubleLinkedList<T> aux = head;
        NodeDoubleLinkedList<T> aux2 = null;
        int count = 0;
        while(aux!=null && count<=index){
            aux2 = aux;
            aux = aux.getNoProximo();
            count++;
        }
        return aux2;
    }

    T get(int index){
        return this.getNode(index).getValor();
    }

    void add(T valor){
        NodeDoubleLinkedList<T> node = new NodeDoubleLinkedList<>(valor);
        if(isEmpty()){
            tail = node;
            head = node;
        }else{
            node.setNoProximo(head);
            head.setNoAnterior(node);
            node.setNoAnterior(null);
            head = node;
        }
    }
    void add(int index, T valor){
        NodeDoubleLinkedList<T> node = new NodeDoubleLinkedList<>(valor);
        if(isEmpty()){
            add(valor);
        }else{
            NodeDoubleLinkedList<T> noAtual = getNode(index);
            NodeDoubleLinkedList<T> noAnterior = getNode(index - 1);
            node.setNoProximo(noAtual);
            noAtual.setNoAnterior(node);
            node.setNoAnterior(noAnterior);
            noAnterior.setNoProximo(node);
        }

    }
    NodeDoubleLinkedList<T> remove(int index){
        NodeDoubleLinkedList<T> aux = getNode(index);
        if(isEmpty()){
            System.out.println("A lista está vazia!!");
        }else if(index == size() - 1){
            tail = getNode(index - 1);
            tail.setNoProximo(null);
        }else if(size() == 1){
            head = null;
            tail = null;
        }else if(index == 0){
            head = getNode(1);
            head.setNoAnterior(null);
        }else{
            getNode(index - 1).setNoProximo(getNode(index + 1));
            getNode(index + 1).setNoAnterior(getNode(index - 1));
        }
        //Os dois passos abaixo não são necessários, mas eu encaro como boa prática
        aux.setNoAnterior(null);
        aux.setNoProximo(null);
        return aux;
    }
    @Override
    public String toString() {
        NodeDoubleLinkedList<T> aux = head;
        String str = "-------------\n";
        str += "LinkedList\n";
        str += "-------------\n";
        while(aux!=null){
            str += "{" + aux.getValor() + "}\n";
            aux = aux.getNoProximo();
        }
        return str;
    }
    public String toStringReverse() {
        NodeDoubleLinkedList<T> aux = tail;
        String str = "-------------\n";
        str += "LinkedList\n";
        str += "-------------\n";
        while(aux!=null){
            str += "{" + aux.getValor() + "}\n";
            aux = aux.getNoAnterior();
        }
        return str;
    }


}
