package com.java.class07;

import java.util.Scanner;

public class Homework7 {

    /*
        Write a java program to Find Company name from the given product
   Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
   Possible Outputs = {google, facebook, microsoft}
         */
    static void company(){
        Scanner sc = new Scanner(System.in);
        String company = sc.nextLine().toLowerCase();
        switch(company) {
            case "gmail":
            case "youtube":
                System.out.println("google");
                break;
            case "whatsapp":
                System.out.println("facebook");
                break;
            case "hangouts":
            case "outlook":
            case "skype":
                System.out.println("microsoft");
                break;
            default:
                System.out.println("Not an option");
        }
    }
//------------------------------------------------------
/*
Write a program to check given character is Vowel or Not
Vowel characters are - 'a','e','i','o','u'
 */
    static void vowel() {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println(input + " is a vowel");
        } else {
            System.out.println(input + " is not a vowel");
        }
    }
    /*
 Write a program to take username and password from user and print appropriate message
based on below conditions
	1. If username correct and password correct ---> Login successful
	2. If username correct and password incorrect --> Invalid password
	3. If username incorrect and password correct --> Invalid username
	2. If username incorrect and password incorrect --> Login unsuccessful
     */
static void login() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Sign Up");
    System.out.println("Record username:");
    String username = sc.nextLine();
    System.out.println("Record Password:");
    String password = sc.nextLine();
    System.out.println("Log In");
    System.out.println("Username:");
    String userLogIn = sc.nextLine();
    System.out.println("Password:");
    String userPwd = sc.nextLine();
    if(username.equals(userLogIn) && password.equals(userPwd)) {
        System.out.println("Login successful");
    } else if(username.equals(userLogIn) && !password.equals(userPwd)) {
        System.out.println("Invalid password");
    } else if(!username.equals(userLogIn) && password.equals(userPwd)) {
        System.out.println("Invalid username");
    } else if(!username.equals(userLogIn) && !password.equals(userPwd)) {
        System.out.println("Login unsuccessful");
    }
}
    public static void main(String[] args) {
login();
    }
}
