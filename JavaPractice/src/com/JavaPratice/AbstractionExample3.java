package com.JavaPratice;


    abstract class Ani {
        abstract void sound();
    }

    class Dog extends Ani{
        void sound() {
            System.out.println("Woof!");
        }
    }

    public class AbstractionExample3  {
        public static void main(String[] args) {
            Ani dog = new Dog();
            dog.sound(); // Output: Woof!
        }
    }


