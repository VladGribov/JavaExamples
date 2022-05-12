package com.java.animal;

public class AnimalTester {
    public static void main(String[] args) {
        Human h1 = new Human(300, 100, 50, "Bob");
        Dog d1 = new Dog(10, 20, 2, "Fido");
        h1.printTaxonomy();
        System.out.println();

        System.out.println("Name: " + h1.getName());
        System.out.println("Weight: " + h1.getWeight());
        System.out.println("Age: " + h1.getAge());
        System.out.println("Height: " + h1.getHeight());
        System.out.println();

        h1.eat(100);
        System.out.println();
        h1.addAge(100);
        System.out.println();
        h1.talk();

        System.out.println("------------------------------------");
        d1.printTaxonomy();
        System.out.println();

        System.out.println("Name: " + d1.getName());
        System.out.println("Weight: " + d1.getWeight());
        System.out.println("Age: " + d1.getAge());
        System.out.println("Height: " + d1.getHeight());
        System.out.println();

        d1.eat(10);
        System.out.println();
        d1.addAge(1);
        System.out.println();
        d1.talk();




    }
}
