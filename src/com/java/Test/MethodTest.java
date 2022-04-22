package com.java.Test;

public class MethodTest {
    //void doesn't return anything
    public void nothing(){
        System.out.println("I don't return anything");
    }

    //this takes a and b as a parameter from the user and returns an integer a+b
    public int add(int a, int b){
        return a+b;
    }

    //this takes a String and returns the string added to itself
    public String word(String a){
        return a+a;
    }

    //this takes String from the user and returns an integer value of the length
    public int lengthOfString(String a){
        return a.length();
    }

    //takes an integer and returns a boolean true or false if statement is true or false
    public boolean isEven(int a){
        return a % 2 == 0; //this is either true or false because we're comparing
    }


    public static void main(String[] args) {
        //MethodTest: class name
        //myTest: this is your variable name, can be anything you want
        //new MethodTest(): this creates an instance of MethodTest class
        MethodTest myTest = new MethodTest();

        //calling methods
        myTest.nothing(); //this will run the nothing method in which we have a println

        //this will run the add method that we made
        myTest.add(1, 2);//Since we never did println inside the add method it won't print anything

        System.out.println(myTest.add(1, 3));//this will print out 1 + 3

        if(myTest.add(1,2) == 3){ //the whole method equals 3 at the end
            System.out.println("Great success!");
        }

        //printing out results of calling methods
        System.out.println(myTest.add(2,4));
        System.out.println(myTest.word("Hello"));
        System.out.println(myTest.lengthOfString("Brother"));
        System.out.println(myTest.isEven(4));

        //since lengthOfString has a return type of int; lengthOfString is just an integer
        if(myTest.lengthOfString("ABC") == myTest.lengthOfString("123")){
            System.out.println("ABC and 123 have the same length");
        }
    }
}
