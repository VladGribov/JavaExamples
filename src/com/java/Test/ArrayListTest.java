package com.java.Test;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Cat");
        arr.add("Stinky");
        arr.add("Bruh");
        arr.add(2);
        Iterator iterate = arr.iterator();
        while(iterate.hasNext()){
            Object it = iterate.next();
            System.out.println(it);
        }
    }
}
