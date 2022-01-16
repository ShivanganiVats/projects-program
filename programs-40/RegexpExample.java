package com.shivangani;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpExample
{
    public static void main(String[] args)
    {
        String string = "var1[value1], var2[value2], var3[value3]";
        Pattern pattern = Pattern.compile("(\\[)(.*?)(\\])");
        Matcher matcher = pattern.matcher(string);

        List<String> listMatches = new ArrayList<String>();

        while(matcher.find())
        {
            listMatches.add(matcher.group(2));
        }

        for(String s : listMatches)
        {
            System.out.println(s);
        }
    }
}