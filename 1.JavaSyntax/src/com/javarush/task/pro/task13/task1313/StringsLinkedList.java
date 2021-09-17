package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        if (last.prev == null) {
            Node node = new Node();
            node.value = value;
            node.prev = first;
            node.next = last;
            first.next = node;
            last.prev=node;
        }
        else {
            Node node = new Node();
            node.value = value;
            Node prelast = last.prev;
            node.prev = prelast;
            prelast.next = node;
            last.prev = node;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}