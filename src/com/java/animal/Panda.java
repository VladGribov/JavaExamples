package com.java.animal;

public class Panda extends Animal implements Characteristics {
    private int weight;
    private int height;
    private int age;
    private String name;

    //class constructor
    public Panda(int weight, int height, int age, String name){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
        taxonomy();
    }
    @Override
    public void setWeight(int weight){
        this.weight = weight;
    }
    @Override
    public int getWeight(){
        return weight;
    }
    @Override
    public void setHeight(int height){
        this.height = height;
    }
    @Override
    public int getHeight(){
        return height;
    }
    @Override
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public int getAge(){
        return age;
    }

    @Override
    public void eat(int food) {
        weight += food;
        System.out.println(name + " ate " + food + " units of food.");
        System.out.println("New weight: " + this.weight + ".");
    }

    @Override
    public void addAge(int age) {
        this.age += age;
        System.out.println(name + " aged " + age + " years.");
        System.out.println("New age: " + this.age + ".");
    }

    @Override
    public void talk() {
        System.out.println("Roar");
    }

    @Override
    public void taxonomy() {
        kingdom = "Animalia";
        phylum = "Chordata";
        class_ = "Mammalia";
        order = "Carnivora";
        family = "Ursidae";
        genus = "Ailuropoda";
        species = "Ailuropoda melanoleuca";
    }

    @Override
    public void printTaxonomy() {
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Phylum: " + phylum);
        System.out.println("Class: " + class_);
        System.out.println("Order: " + order);
        System.out.println("Family: " + family);
        System.out.println("Genus: " + genus);
        System.out.println("Species: " + species);
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
