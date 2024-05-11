package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyList<Integer> list = new MyList();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(2);
        list.print();
        list.remove(0);
        list.print();
        System.out.println(list.get(5));
    }
}