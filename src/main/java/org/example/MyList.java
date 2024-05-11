package org.example;

public class MyList {
    private Node head;
    private int size;

    public MyList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }
        return current.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        ++size;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            int data = head.data;
            head = head.next;
            --size;
            return data;
        }
        Node current = head;
        for (int i = 0; i < index - 1; ++i) {
            current = current.next;
        }
        int data = current.next.data;
        current.next = current.next.next;
        --size;
        return data;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
