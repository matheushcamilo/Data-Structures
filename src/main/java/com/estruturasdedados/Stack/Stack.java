package com.estruturasdedados.Stack;

public class Stack{
    private Node top;
    private final int MAX;
    private int count;
    public Stack(int MAX) {
        this.top = null;
        this.MAX = MAX;
        this.count = 0;
    }
    void push(Node node){
        if (!isFull()) {
            Node aux = top;
            top = node;
            top.setRef(aux);
            count++;
        }else{
            System.out.println("Stack Overflow!!!");
        }
    }
    Node top(){
        return this.top;
    }
    Node pop(){
        if(!isEmpty()){
            Node aux = top;
            top = top.getRef();
            aux.setRef(null);
            count--;
            return aux;
        }else{
            System.out.println("Stack Underflow!!!");
            return null;
        }
    }
    boolean isEmpty(){
        if(count > 0){
            return false;
        }
        else{
            return true;
        }
    }
    boolean isFull(){
        if (count < MAX){
            return false;
        }
        else{
            return true;
        }
    }
}
