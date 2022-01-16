package com.shivangani;

import java.util.*;

public class Collections6 {
    public static void main(String [] args) {
        //creating array-list

        System.out.println("ArrayList");
        ArrayList<String>city = new ArrayList<String>();
        city.add("Khargone");
        city.add("Indore");
        System.out.println(city);

        //creating vector

        System.out.println("\n");
        System.out.println("Vector");
        Vector<Integer> vec = new Vector();
        vec.addElement(100);
        vec.addElement(200);
        System.out.println(vec);

        //creating linked-list

        System.out.println("\n");
        System.out.println("LinkedList");
        LinkedList<String> names = new LinkedList<String>();
        names.add("Raj");
        names.add("Pawan");

        Iterator<String> itr=names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

            //creating hash-set

            System.out.println("\n");
            System.out.println("HashSet");
            HashSet<Integer> set = new HashSet<Integer>();
            set.add(100);
            set.add(105);
            set.add(110);
            set.add(115);
            System.out.println(set);

            //creating linked-hash-set

            System.out.println("\n");
            System.out.println("LinkedHashSet");
            LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
            set2.add(1);
            set2.add(2);
            set2.add(3);
            set2.add(4);
            System.out.println(set2);

        }
    }

    public static List<String> emptyList() {
        /* TODO Auto-generated method stub */
        return null;
    }
}
