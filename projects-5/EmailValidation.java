package com.shivangani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {

    public static boolean isEmailValid(String email) {
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String [] args) {
        List<String> emails = new ArrayList<String>();

//		Valid Email Address Type

        emails.add("raj@myapple.com");
        emails.add("rajafc@myapple.com");
        emails.add("rajkumar@myapple.com");
        emails.add("rajmahajan@myapple.com");

//	    Invalid Email Address Type

        emails.add("yogi.myapple.com");
        emails.add("pavanafc.myapple.com");
        emails.add("punit.myapple.com");
        emails.add("shivani.myapple.com");

        System.out.println("Enter Email address you want to check");
        Scanner theChecker = new Scanner(System.in);
        String input = theChecker.nextLine();
        System.out.println("The Email address " + input + " is " + (isEmailValid(input) ? "valid" : "invalid"));
    }
}
