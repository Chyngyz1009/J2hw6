package com.company;

public class Main {

    public static void main(String[] args) {

        Window<Integer> window1 = new Window<>(6);
        Window<Double> window2 = new Window<>(3.7);
        window1.print();
        window2.print();



    }
}
