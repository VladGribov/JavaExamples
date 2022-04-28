package com.java.Test;
import java.util.*;

class User{
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

        }
public class ArrayListUserDefinedObject {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Vladimir", 23));
        users.add(new User("Greg", 40));
        users.add(new User("Catherine", 22));
        users.add(new User("Samantha", 25));

        Iterator<User> iterateUsers = users.iterator();
        while(iterateUsers.hasNext()){
            User now = iterateUsers.next();
            System.out.println(now.getName() + " is " + now.getAge());
        }



    }
}
