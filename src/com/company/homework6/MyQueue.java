package com.company.homework6;

public class MyQueue <T> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size(){
        return size;
    }

    public void remove(int index) {
        if (index >= size) { return; }
        if (index == 0) {
            first = first.next;
        } else if (index == size - 1) {
            Node tmp = first;
            while (tmp.next != last) {
                tmp = tmp.next;
                last = tmp;
                tmp.next = null;
            }
        }else {
            remove(first, index);
        }
        size--;
    }

    private void remove(Node head, int index) {
        if (index <= 1) {
            head.next = head.next.next;
        } else {
            remove(head.next, --index);
        }

    }

    public void clear() {
        first = null;
        size = 0;
    }

    public T peek() {
        return first.item;
    }

    public void add(T item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        }
        else {
            oldLast.next = last;
        }
        size++;
    }

    public T poll() {
        T item = first.item;
        first = first.next;
        if (isEmpty())  last = null;
        size--;
        return item;
    }

    public void show() {
        show(first);
        System.out.println();
    }

    private void show(Node head) {
        if (head != null) {
            System.out.print(head.item + " ");
            show(head.next);
        }
    }
}
