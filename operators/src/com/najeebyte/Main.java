package com.najeebyte;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Resultl is now " + result);
        result--;
        System.out.println("Resultl is now " + result);

        result += 2;
        System.out.println("result in now " + result);
        result *= 10;
        System.out.println("Resultl is now " + result);
        result -= 10;
        System.out.println("Resultl is now " + result);
        result /= 10;
        System.out.println("Resultl is now " + result);

        boolean alian = false;
        if (alian == true)
            System.out.println("It is not an alient");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("you got the higt score!");

        int secoundtopscore = 60;
        if(topScore > secoundtopscore && topScore < 100)
            System.out.println("Greater than top score and less then 100");

        if ((topScore >90) || (secoundtopscore <= 90) )
            System.out.println("one of these test is true");

        int newvalue = 50;
        if(newvalue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("this is not supposed to happen");

        isCar = true;

        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");



        double myfirstvalue = 20d;
        double mysecoundvalue = 80;
        double mytotal = (myfirstvalue + mysecoundvalue) * 25;
        System.out.println("mytotal = " + mytotal);
        double theremainder = mytotal % 40;
        if(theremainder <=20)
            System.out.println("total was over the limit");









    }
}
