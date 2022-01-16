package com.Shivangani;

public class TypeCasting
    {

        public static void main (String[] args)
        {

        System.out.println("Implicit Type Casting");
        char a = 'A';
        System.out.println("Value of a is : " + a);

        int b = a;
        System.out.println("Value of b is : " + b);

        float c = a;
        System.out.println("Value of c is : " + c);

        long d = a;
        System.out.println("Value of d is : " + d);

        double e = a;
        System.out.println("Value of e is : " + e);

        System.out.println("\n");

        System.out.println("Explicit Type Casting");

        double n = 22.5;
        int m = (int) n;
        System.out.println("Value of n is : " + n);
        System.out.println("Value of m is : " + m);

    }

    }
