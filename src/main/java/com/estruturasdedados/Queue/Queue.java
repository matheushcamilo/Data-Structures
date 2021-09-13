package com.estruturasdedados.Queue;

import com.estruturasdedados.Stack.Node;

public class Queue {
    private Node head;

    public Queue() {
        this.head = null;
    }
    boolean isEmpty(){
        return head == null ? true : false;
    }

    void enqueue(Node node) {
        node.setRef(head);
        head = node;
    }
    Node first(){

        Node aux;
        if (!this.isEmpty()) {
            aux = head;
            while(aux.getRef()!=null){
                aux = aux.getRef();
            }
            return aux;
        } else {
            return null;
        }
    }

    Node dequeue() {
        if(!isEmpty()){
            Node aux = head;
            Node aux2 = aux;
            while (aux.getRef() != null) {
                aux2 = aux;
                aux = aux.getRef();
            }
            aux2.setRef(null);
            return aux;
        }
        System.out.println("Stack Underflow!!!");
        return null;
    }

    public String toString() {
        String str = "-----------\n";
        str += "Queue\n";
        str += "-----------\n";
        Node aux = head;
        while (true) {
            if (aux.getRef() == null){
                str += "{" + aux.getValue() + "}\n";
                break;
            }
            str += "{" + aux.getValue() + "}\n";
            aux = aux.getRef();
        }
        return str;
    }


}
