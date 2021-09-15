package com.estruturasdedados.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list.toString());
        list.add(2,40);
        System.out.println(list.toString());
        System.out.println("Próximo nó é: " + list.getNode(2).getNoProximo().getValor());
        System.out.println("Nó anterior é: " + list.getNode(2).getNoAnterior().getValor());
        System.out.println(list.getNode(1).getNoProximo().getValor());
        System.out.println(list.getNode(3).getNoAnterior().getValor());
        System.out.println(list.size());
        System.out.println(list.toStringReverse());
        list.remove(1);
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
        System.out.println(list.remove(2).toString());
        System.out.println(list.toString());
        System.out.println(list.getTail().toString());
    }
}
