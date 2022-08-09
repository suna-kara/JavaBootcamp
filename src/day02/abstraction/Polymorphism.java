package day02.abstraction;

import day02.abstraction.*;

public class Polymorphism {
    public static void main(String[] args) {
        LuxuryCar luxuryCar1=new BMW();
        luxuryCar1.message();

        LuxuryCar luxuryCar2=new Mercedes();

      //  LuxuryCar luxuryCar3=new Tesla();

        System.out.println("-------------------------------------");

        Car car=new Mercedes();
        car.drive();
        car.start();
        car.stop();
        ((Mercedes) car).message();
    }
}
