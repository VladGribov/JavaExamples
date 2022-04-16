package com.java.practice;

import java.util.Locale;

public class PracticeZoom {
    public static void main(String[] args) {
        String str = "Hill Hill Hill Beach Lake";
        String str1 = "HIll hIll HILL bEAch laKe";
        String str2 = str.replace("Hill" , "House");
        System.out.println(str2);

        if(str.equalsIgnoreCase(str1)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(str.contains("Hill")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String str3 = "CAKE";
        String str4 = str3.toLowerCase();
        System.out.println(str4);
        System.out.println(str4.toUpperCase());
        System.out.println(str4);

        String str5 = "%s Hello %s";
        System.out.println(String.format(str5, "Greg", "Vladimir"));

        String str6 = "Hello World";
        System.out.println(str6.substring(3,8));
        System.out.println(str6.substring(0,3));
        System.out.println(str6.substring(4));




    }
}
