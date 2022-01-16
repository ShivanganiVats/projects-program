package com.shivangani;

class StudentInfo {
    int id;
    String name;
    void display() {
        System.out.println(id+" "+name);
    }
}

class PlayerInfo {
    int id;
    String name;
    PlayerInfo(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}

public class Constructors5 {
    public static void main(String[] args) {

        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();
        s1.display();
        s2.display();

        PlayerInfo p1 = new PlayerInfo(1, "Raj");
        PlayerInfo p2 = new PlayerInfo(2, "Mitesh");
        p1.display();
        p2.display();
    }
}
