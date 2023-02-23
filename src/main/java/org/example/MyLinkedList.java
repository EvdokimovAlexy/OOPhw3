package org.example;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {
    private Node head = null;
    static class Node {
        private final String object;
        private final Node next;
        public Node(String object, Node node) {
            this.object = object;
            this.next = node;
        }
          public String getElement() {
            return this.object;
        }
        public Node getNext() {
            return this.next;
        }
    }
    static class LinkedListIterator implements Iterator<String> {
        private Node currentNode;
        private int counter = 0;
        public LinkedListIterator(MyLinkedList linkedList) {
            this.currentNode = linkedList.head;
        }

        public boolean hasNext() {
            return this.currentNode != null;
        }
        public String next() {
            String object = this.currentNode.getElement();
            this.currentNode = this.currentNode.getNext();
            this.counter++;
            return object;
        }
    }
    public void addFirst(String object) {
        this.head = new Node(object, this.head);
    }

    @Override
    public Iterator<String> iterator() {
        return new LinkedListIterator(this);
    }
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (String i : this) {
            output.append(i).append("\n");
        }
        return output.toString();
    }
}