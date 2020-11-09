package com.company;

public class Window<T extends Number> implements Mirrow {

    private T number;

    public Window(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("number   " + getNumber());
    }
}

