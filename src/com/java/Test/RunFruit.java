package com.java.Test;

public class RunFruit {
    public static void main(String[] args) {
        ProbabilityFruit apple = new ProbabilityFruit();
        apple.setColor("Grey");
        apple.setSize(100);
        apple.setTaste("Sandy");
        apple.setAmount(0, 30, 1000);
        System.out.println(apple.getAmount());
        /*
        int i=0;
        int average = 0;
        int increment = 50;
        while(i<increment) {
            apple.setAmount(0, 80, 100);
            average += apple.getAmount();
            i++;
        }
        average /= increment;
        System.out.println("Average= " + average);
        */
    }
}
