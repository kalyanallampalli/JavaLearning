package com.learning.day2;

interface BasicAnimal {
    public void eat();
    public void sleep();
}

class Monkey {
    public void jump() {
        System.out.println("Monkey Jumping..");
    }

    public void bite() {
        System.out.println("Monkey Biting..");
    }
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping..");
    }

    @Override
    public void jump() {
        System.out.println("Human jumping..");
    }
}

public class Exercise3Demo {
    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();

        // Demonstrate polymorphism / dynamic dispatch
        Monkey monkey = new Human();
        monkey.jump();
    }
}
