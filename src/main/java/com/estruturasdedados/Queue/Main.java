package com.estruturasdedados.Queue;

import com.estruturasdedados.Stack.Node;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila = new Queue<>();
        fila.enqueue("teste");
        fila.enqueue("teste2");
        fila.enqueue("Sucesso");
        fila.enqueue("Agora sim!");
        System.out.println(fila.toString());
        System.out.println(fila.first().toString());
        System.out.println(fila.dequeue().toString());
        System.out.println(fila.dequeue().toString());
        System.out.println(fila.dequeue().toString());
        System.out.println(fila.dequeue().toString());
    }


}
