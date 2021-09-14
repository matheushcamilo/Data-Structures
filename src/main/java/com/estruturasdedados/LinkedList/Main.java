package com.estruturasdedados.LinkedList;

import com.estruturasdedados.Stack.Node;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add(0,"teste1");
        list.add(1,"teste2");
        list.add(2,"teste3");
        list.add(3,"teste4");
        list.add(2,"teste5");

        System.out.println(list.toString());
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.toString());

    }
}
