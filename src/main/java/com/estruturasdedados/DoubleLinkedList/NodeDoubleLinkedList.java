package com.estruturasdedados.DoubleLinkedList;

import com.estruturasdedados.Stack.Node;

public class NodeDoubleLinkedList<T> {
    private NodeDoubleLinkedList<T> noAnterior;
    private NodeDoubleLinkedList<T> noProximo;
    private T valor;
    public NodeDoubleLinkedList(T valor){
        noAnterior = null;
        noProximo = null;
        this.valor = valor;
    }

    public NodeDoubleLinkedList<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NodeDoubleLinkedList<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    public NodeDoubleLinkedList<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NodeDoubleLinkedList<T> noProximo) {
        this.noProximo = noProximo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "valor=" + (getValor());
    }
}
