package com.najeebyte;

public class Main {

    public static void main(String[] args) {
	// int has a width of 32
        int myminnum = -2_147_483_64;
        int mymaxnum = 2_147_483_647;
    // byte has a width of 8
        byte mybytevalue = -128;
        byte mynewbytevalue = (byte) (mybytevalue/2);
        System.out.println("new value =" + mynewbytevalue);
    // short has a width of 16
        short myshortvalue = 32767;
        short mynewshortvalue = (short) (myshortvalue / 2);
        System.out.println("new short value =" + mynewshortvalue);

    // long has a width of 64
        long mylongvalue = 100L;

        byte bytvalue = 10;
        short shortvalue = 20;
        int intvalue = 50;

        long longvalue = 50000L +10L *(bytvalue + shortvalue + intvalue);
        System.out.println("long value" +longvalue);


    }
}
