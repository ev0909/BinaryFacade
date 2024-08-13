package org.example;


public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println(bins.mult("1011100010", "1001"));
        System.out.println(bins.sum("000011", "101010101"));
    }
}