package com.estruturasdedados.Queue;

import com.estruturasdedados.Stack.Node;

public class Main {
    public static void main(String[] args) {
        Queue fila = new Queue();
        Node no1 = new Node("teste");
        Node no2 = new Node(54);
        Node no3 = new Node(23);
        Node no4 = new Node(80);
        fila.enqueue(no1);
        fila.enqueue(no2);
        fila.enqueue(no3);
        fila.enqueue(no4);
        System.out.println(fila.toString());
        System.out.println(fila.first().toString());
        System.out.println(fila.dequeue().toString());
        System.out.println(fila.dequeue().toString());
        System.out.println(fila.dequeue().toString());
        System.out.println(fila.dequeue().toString());
    }


}
