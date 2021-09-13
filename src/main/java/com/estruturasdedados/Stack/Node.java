package com.estruturasdedados.Stack;

public class Node<T>{
    private  T value;
    private Node<T> ref = null;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node getRef() {
        return ref;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setRef(Node ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "valor=" + (this.value);
    }
}
