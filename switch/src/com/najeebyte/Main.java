package com.najeebyte;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        int value = 1;
//        if (value == 1){
//         System.out.println("value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("value was 2");
//        }
//        else {
//            System.out.println("was not 1 or 2");
//        }

        int switchvalue = 1;
        switch(switchvalue){
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3,or 4,or,5");
                System.out.println("Actually it was a " + switchvalue );
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char charvalue = 'g';
        switch(charvalue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case'E':
                System.out.println(charvalue + "was found");
                break;

            default:
                System.out.println("Could not find A, b,c,d,or f");
                break;
        }

    }
}