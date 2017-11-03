package com.najeebyte;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1000 at 2% interest = "+ calculateinterest(10000.00,2.0));
        for(int i=0; i<5; i++){
            System.out.println("Loop " + i+"hola...!!!" );
        }

        for(int i=2; i<9; i++){
            System.out.println("1000 at "+i+ " interest = "+ String.format("%.2f",calculateinterest(10000.00,i)));
        }
        for(int i=8; i>=2; i--){
            System.out.println("1000 at "+i+ " interest = "+ String.format("%.2f",calculateinterest(10000.00,i)));

        int count =0;
        for(int b=10;b<50;b++){
            count++;
            System.out.println("number "+b+" is a prime number");
            if(count ==3){
                System.out.println("exite for loop");
                break;
            }


        }
    }}


    public static boolean isprime(int n){
        if(n ==1){
            return false;
        }
        for(int a; a<=n/2; a++){
            if(n % a == 0){
                return false;
            }

        }
    }


    public static double calculateinterest(double amount, double interestrate){
        return(amount*(interestrate/100));
    }
}
