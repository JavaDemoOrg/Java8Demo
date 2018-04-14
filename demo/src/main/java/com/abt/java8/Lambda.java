package com.abt.java8;

public class Lambda {

    public static void main(String[] args) {

        new Thread(()->System.out.print("test")).start();

    }

}
