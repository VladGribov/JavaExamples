package com.java.Test;

public class InterfacePractice {
    interface Fruit{
        void type();
        void taste();
    }
    static class Apple implements Fruit{
        private String typeOf;
        private String tasteOf;
        void setTypeOf(String newType){
            typeOf = newType;
        }
        void setTasteOf(String newTaste){
            tasteOf = newTaste;
        }
        public void type(){
            System.out.println("The apple is " + typeOf);
        }
        public void taste(){
            System.out.println("Tastes like " + tasteOf);
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setTasteOf("Chicken");
        apple.setTypeOf("Long");
        apple.taste();
        apple.type();
    }
}
