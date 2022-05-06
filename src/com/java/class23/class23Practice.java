package com.java.class23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class class23Practice {
    public void max(int[][] arr) {
        int max;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Max of row " + (i + 1) + " is: " + max);
        }
    }

    public void count(int[] arr) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    public void count2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int even = 0, odd = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Row " + (i + 1) + " Even: " + even);
            System.out.println("Row " + (i + 1) + " Odd: " + odd);
        }
    }

    public void wordLength(String str) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Length of word " + arr[i] + " is: " + arr[i].length());
        }
    }

    public void findFrequency(String str) {
        String[] arr = str.toLowerCase().split(" ");
        String[] copy = str.toLowerCase().split(" ");
        String[] copy1 = str.toLowerCase().split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            if (!(arr[i].equals(""))) {
                count++;
            }
            if (!(arr[i].equals(""))) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals(temp)) {
                        arr[j] = "";
                    }
                }
            }
        }
        String[] words = new String[count];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                if (!copy[j].equals("")) {
                    words[i] = copy[j];
                    for (int k = 0; k < copy.length; k++) {
                        if (copy[k].equals(words[i])) {
                            copy[k] = "";
                        }
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < words.length; i++){
            int count1 = 0;
            for(int j = 0; j < copy1.length; j++){
                if(words[i].equals(copy1[j])){
                    count1++;
                }
            }
            System.out.println(words[i] + " = " + count1);
        }
    }
    public void frequency(String str){
        Map<String, Integer> myMap = new HashMap<>();
        String[] arr = str.toLowerCase().split(" ");
        for(String s: arr){
            if(!myMap.containsKey(s)){
                myMap.put(s,1);
            }else{
                myMap.put(s, myMap.get(s)+1);
            }
        }
        System.out.println(myMap);
    }

    public static void main(String[] args) {
        class23Practice hw = new class23Practice();
        String string = "Hello this is hello cat dog dog cat house mouse mouse house house";
        hw.frequency(string);
    }
}










