package com.shivangani;

public class InnerClass7_1 {
    private String msg = "This is inner class";
    void display() {
        class Inner1 {
            void msg() {
                System.out.println(msg);
            }
        }
        Inner1 a = new Inner1();
        a.msg();
    }

    public static void main(String [] args) {
        InnerClass7_1 ob = new InnerClass7_1();
        ob.display();
    }
}
