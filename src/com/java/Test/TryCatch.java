package com.java.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch(Exception e){
            throw new InputMismatchException("Invalid input, also cows Moo");
        }
    }
}
