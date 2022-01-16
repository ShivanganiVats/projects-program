package com.Shivangani;

public class AccessModifiers {
    public int a = 100;
    private int b = 200;
    int c = 300;
    protected int d = 400;

    void show() {
        System.out.println("Public A = " + a);
        System.out.println("Private B = " + b);
        System.out.println("Default C = " + c);
        System.out.println("protected D = " + d);
    }

    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();
        access.show();
    }
}


