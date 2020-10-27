package academy.learnprogramming;

import java.lang.management.BufferPoolMXBean;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Interger Minimum Value = " + myMinIntValue);
//        System.out.println("Interger Maximum Value = " + myMaxIntValue);
//        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflow
//        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow
        // Int occupies 32 bits


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Minimum Value = " + myMinByteValue );
//        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // Byte occupies 8 bits


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Minimum Value = " + myMinShortValue );
//        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // Short occupies 16 bits

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Minimum Value = " + myMinLongValue );
//        System.out.println("Long Maximum Value = " + myMaxLongValue);
        // Long occupies 16 bits

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // Casting : Converting from one type to another

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte newByteVariable = Byte.MIN_VALUE;

        short newShortVariable = Short.MIN_VALUE;

        int newIntVariable = Integer.MIN_VALUE;

        long newLongVariable = 50000L + 10L * (newByteVariable + newShortVariable + newIntVariable);

        System.out.println("New Long Variable: " + newLongVariable);


}
