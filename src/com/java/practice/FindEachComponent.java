package com.java.practice;

public class FindEachComponent {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";
        String[] newStr = address.split(", ");
        for (String s : newStr) {
            System.out.println(s);
        }
    }

}
