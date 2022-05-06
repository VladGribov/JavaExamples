package com.java.Test;

public class ProbabilityFruit {
    private String color;
    private int size;
    private String taste;
    private int amount;
    public String getColor(){
        return color;
    }
    public int getSize(){
        return size;
    }
    public String taste(){
        return taste;
    }
    public int getAmount(){
        return amount;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setSize(int newSize){
        size = newSize;
    }
    public void setTaste(String newTaste){
        taste = newTaste;
    }
    public void setAmount(int min, int mid, int max){

        int range1 = (mid - min) + 1;
        int range2 = (max - mid) + 1;
        int lower = (int)(Math.random() * range1) + min;
        int upper = (int)(Math.random() * range2) + mid;
        int rangeFinal = (upper - lower) + 1;
        amount = (int)(Math.random() * rangeFinal) + lower;
    }

}