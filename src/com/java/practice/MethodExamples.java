package com.java.practice;

import com.java.class18.Class18Practice;

public class MethodExamples {
    private int height;
    private int weight;

    public MethodExamples(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public void  setWeight(int weight){
        this.weight = weight;
    }

    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }


    public static void main(String[] args) {
        MethodExamples Vlad = new MethodExamples(180, 300);
        MethodExamples Becky = new MethodExamples(200, 1);

        System.out.println("Vlad is " + Vlad.getHeight() + " cm and weighs " + Vlad.getWeight() + "kg");
        System.out.println("Becky is " + Becky.getHeight() + " cm and weighs " + Becky.getWeight() + "kg");

    }
}
