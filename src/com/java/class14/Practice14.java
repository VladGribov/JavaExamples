package com.java.class14;

public class Practice14 {
    public static void main(String[] args) {
        String str1 = "Hello World. Welcome to devX";
        System.out.println(str1.indexOf("W", str1.indexOf("W")+1));
        str1 = "Welcome %s";
        System.out.println(String.format(str1, "Vladimir"));
        System.out.println(str1.replace("Welcome", "Helo"));
    }
}
