package com.company.homework6;

public class MyArrayList <T> {
    private T[] data = (T[]) new Object[10];
    private int size = 0;

    private void resize(int newSize) {
        T[] tmp = (T[]) new Object[newSize];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
    }

    public void add(T value) {
        if (size >= data.length) {
            resize(2 * data.length);
        }
        data[size++] = value;
    }


    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }


    public void clear() {
        data = (T[]) new Object[10];
        size = 0;
    }


    public int size() {
        return size;
    }


    public T get(int index) {
        return data[index];
    }

}

