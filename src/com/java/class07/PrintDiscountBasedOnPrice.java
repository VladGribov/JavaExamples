package com.java.class07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Take a price from user and print discount value based on price
//if price < 100 the print no discount
//if price < 500 = 5% discount
//if price < 1000 print 10%
//if price > 1000 print 15%
public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Map<Double, String> discount = new HashMap<Double, String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price:");
        double price = sc.nextDouble();
        if(price < 100) {
            discount.put(price, "No discount");
        } else if(price < 500) {
            discount.put(price, "5% discount");
        } else if(price < 1000) {
            discount.put(price, "10% discount");
        } else if(price >= 1000) {
            discount.put(price, "15% discount");
        }
        System.out.println(discount.get(price));
    }
}
