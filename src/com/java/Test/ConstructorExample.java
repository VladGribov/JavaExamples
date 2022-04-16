package com.java.Test;

public class ConstructorExample {
    public static class Monkey{
        private String monke;
        public Monkey(String type){
            monke = type;
        }
        public String getMonke(){
            return monke;
        }
    }
    public static void main(String[] args) {
        Monkey chimp = new Monkey("Chimp");
        System.out.println(chimp.getMonke());
    }
}
