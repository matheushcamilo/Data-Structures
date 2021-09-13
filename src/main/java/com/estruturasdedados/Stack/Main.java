package com.estruturasdedados.Stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        Node no1 = new Node("Teste");
        Node no2 = new Node("hahahaha");
        Node no3 = new Node("Outro teste");
        Node no4 = new Node(7);
        Node no5 = new Node(1651541674521L);
        Node no6 = new Node(10);

        s.push(no1);
        s.push(no2);
        s.push(no3);
        Node aux = s.pop();
        System.out.println(aux.toString());
        s.push(no3);
        s.push(no4);
        s.push(no5);
        s.push(no6);
        aux = s.top();
        System.out.println(aux.toString());
        aux = s.pop();
        aux = s.pop();
        aux = s.pop();
        aux = s.pop();
        aux = s.pop();
        aux = s.pop();

    }
}
