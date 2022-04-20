package com.java.Test;

import java.util.Scanner;

public class RainyOrSunny {
    public static void main(String[] args) {
        //TODO implement your code here...
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Java program to allow the user to input weather and temperature outside.");
        String thingsToTake = "";
        String weather= sc.nextLine();
        System.out.println("Enter weather outside");
        double temperature = sc.nextDouble();
        System.out.println("Enter temperature outside");
        System.out.println("Enter weather outside Rainy,Sunny,Snowy");
        if (temperature>=50){
            if (weather.equals("Snowy")|| weather.equals("Rainy")){
                thingsToTake = "umbrella";
                System.out.println("Take umbrella");
            } else if ( weather.equals("Sunny") )  {
                thingsToTake = "SunGlass";
                System.out.println("Please take SunGlass");
            } else
            if (temperature < 50)
                if(weather.equals("Snowy") && weather.equals("Rainy")){
                    thingsToTake = "Please take umbrella & coat";
                    System.out.println("Take umbrella & coat");
                }else if (weather.equals("Sunny"))
                    thingsToTake = "Please take a coat only";
            System.out.println("Please take a coat only ");



        }


    }


}