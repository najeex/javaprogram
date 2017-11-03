package com.najeebyte;

public class Main {

    public static void main(String[] args) {
	// primitive datatype...!!!
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "this is string...";
        System.out.println("mystring is equal to " + myString);
        myString = myString + ", add this is more ,";
        System.out.println("mystring is equal to " + myString);
        myString = myString + " \u00A9";
        System.out.println("mystring is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "232.232";
        System.out.println("the result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equeal to "+ lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("laststring value: " + lastString);


    }
}
