package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Animal implements Runnable {
    static List<Animal> animals = new ArrayList<>();
    static int year;
    //I want the animal to age
    int weight;
    int age;
    int energy;
    String name;
    String letter;

    abstract void talk();

    abstract Animal reproduce();

    abstract void death();

    double rand() {
        return Math.random() * 9 + 1;
    }

    void eat(int food) {
        this.weight += food / 2;
        //if grass
        this.energy += food;
        //if meat
    }

    boolean checkDead() {
        if (age > 100 || energy <= 0) {
            return true;
        }
        return false;
    }

    String randName() {
        String name = letter;
        int max = 122;
        int min = 97;
        int range = max - min + 1;
        for (int i = 1; i < 4; i++) {
            if (Math.random() >= 0.75 || ((name.charAt(i - 1) != 97 || name.charAt(i - 1) != 101 || name.charAt(i - 1) != 105 || name.charAt(i - 1) != 111 || name.charAt(i - 1) != 117) && Math.random() <= 0.5)) {
                double chance = Math.random();
                if (chance <= 0.2) {
                    name += (char) 97;
                } else if (chance <= 0.4) {
                    name += (char) 101;
                } else if (chance <= 0.6) {
                    name += (char) 105;
                } else if (chance <= 0.8) {
                    name += (char) 111;
                } else {
                    name += (char) 117;
                }
            } else {
                char rand = (char) (Math.random() * range + min);
                if (rand == name.charAt(i - 1)) {
                    i--;
                } else {
                    name += rand;
                }
            }
        }
        return name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    Thread thread;

    void runThread() {
        thread = new Thread(this);
        thread.start();
    }

    void update() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Year: " + year);
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            int rand = (int) rand();
            //eating
            double foodRate = 1;
            if (animals.size() >= 20) {
                int size = animals.size();
                double mult = 1;
                while (size > 1) {
                    mult = mult + 1.0 / size;
                    size /= 10;
                }
                foodRate = foodRate * mult;
            }
            if (Math.random() >= 0.9 * foodRate) {
                a.eat(rand);
                System.out.println(a.name + ": Yum!");
                System.out.println(a.name + " ate " + rand + " food");
            }
            //talking
            if (Math.random() <= 0.1) {
                a.talk();
            }
            //reproduce
            if (Math.random() <= 0.25 && a.age > 4 && a.energy > 5) {
                String name = a.reproduce().name;
                System.out.println(name + " was born to " + a.name);
                a.energy--;
            }
            //check dead
            if (a.checkDead()) {
                a.death();
                System.out.println(a.name + " died.");
                animals.remove(i);
            }
            a.energy--;
            a.age++;
        }
        year++;
        System.out.println("Total alive: " + animals.size());
        if (animals.size() == 0) {
            //change this don't want to use stop
            thread.stop();
        }
        Iterator<Animal> iterate = animals.iterator();
        List<String> names = new ArrayList<>();
        while(iterate.hasNext()){
            Animal a = iterate.next();
            names.add(a.name);
        }
        System.out.println(names);
    }

    @Override
    public void run() {
        double div = 0.7;
        double interval = 1000000000 / div; //0.01666 seconds
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        while (thread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / interval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                delta--;
            }
        }
    }
}

class Pig extends Animal {
    Pig() {
    }

    Pig(int age, int energy, int weight) {
        this.age = age;
        this.energy = energy;
        this.weight = weight;
        this.letter = "P";
        this.name = randName();
        animals.add(this);
    }

    @Override
    void talk() {
        System.out.println(name + ": Oink Oink");
    }

    @Override
    Pig reproduce() {
        return new Pig(0, 10, 10);
    }

    @Override
    void death() {
        System.out.println("Oiiiink....");
    }
}

class Dog extends Animal {
    Dog() {
    }

    Dog(int age, int energy, int weight) {
        this.age = age;
        this.energy = energy;
        this.weight = weight;
        this.letter = "D";
        this.name = randName();
        animals.add(this);
    }

    @Override
    void talk() {
        System.out.println(name + ": Woof Woof");
    }

    @Override
    Dog reproduce() {
        return new Dog(0, 13, 10);
    }

    @Override
    void death() {
        System.out.println("Woof woof....");
    }
}
