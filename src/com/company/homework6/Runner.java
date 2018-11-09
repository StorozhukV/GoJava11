package com.company.homework6;

public class Runner {
    public static void main(String[] args) {
        System.out.println("-----------Hash Map-----------");
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("10", "ten");
        hashMap.put("3", "three");
        hashMap.put("10", "tenn");
        hashMap.put("10", "tennn");
        hashMap.show();

        System.out.println("--------------------------------------------" +
                "\n-----------Linked List-----------");

        MyLinkedList linkedList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i + 3);
        }
        System.out.println("Array:");
        linkedList.show();
        System.out.println("Size = " + linkedList.size());
        System.out.println("Element " + linkedList.get(2) + " will be removed");
        linkedList.remove(2);
        linkedList.show();
        System.out.println("Element " + linkedList.get(linkedList.size() - 1) + " will be removed");
        linkedList.remove(linkedList.size() - 1);
        linkedList.show();
        System.out.println("\n New Array:");
        linkedList.clear();
        for (int i = 0; i < 15; i++) {
            linkedList.add(i * 5);
        }
        linkedList.show();

        System.out.println("--------------------------------------------" +
                "\n-----------Queue-----------");

        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(10);
        queue.add(20);
        queue.show();
        queue.poll();
        queue.show();
        queue.add(30);
        queue.show();
        queue.poll();
        queue.show();
        queue.clear();
        for (int i = 0; i < 10; i++) {
            queue.add(i*5);
        }
        queue.show();
        System.out.println("size = " + queue.size());
        queue.add(6);
        queue.show();

        System.out.println("--------------------------------------------" +
                "\n-----------Stack-----------");

        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(2);
        stack.push(6);
        for (int i = 0; i < 15; i++) {
            stack.push(i*5);
        }
        stack.show();
        stack.pop();
        stack.show();
        System.out.println(stack.peek());
        stack.remove(stack.size()-1);
        stack.show();
        stack.clear();
        stack.show();
        System.out.println("size = " + stack.size());

        System.out.println("--------------------------------------------" +
                "\n-----------Array List-----------");

        MyArrayList arrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Size = " + arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\nElement " + arrayList.get(arrayList.size() - 1) + " will be removed");
        arrayList.remove(arrayList.size() - 1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\nSize = " + arrayList.size());
        arrayList.clear();
        System.out.println("\n\tClear\nSize = " + arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
    }

}
