package com.najeebyte;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car();
        Car holder = new Car();

        System.out.println("model is " + porsche.getModel());
        porsche.setModel("najeeb");

        System.out.println("model is " + porsche.getModel());
    }
}
