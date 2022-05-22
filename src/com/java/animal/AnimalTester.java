package com.java.animal;

public class AnimalTester {
    public static void main(String[] args) {
        Human h1 = new Human(300, 100, 50, "Bob");
        Dog d1 = new Dog(10, 20, 2, "Fido");
        Panda b1 = new Panda(100,20,5,"Misha");
        System.out.println(b1.getHeight());
        b1.setHeight(200);
        System.out.println(b1.getHeight());
        b1.eat(100);
        b1.addAge(40);
    }
}
