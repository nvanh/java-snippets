package com.nva;

public class NextHigherNumberWithSame1Bit {
    public static void main(String[] args) {
        int n = 31;

        int rightOne = n & -n;
        int nextHigherOneBit = n + rightOne;
        int rightOnePattern = n ^ nextHigherOneBit;

        rightOnePattern = rightOnePattern / rightOne;
        rightOnePattern >>= 2;

        int next = nextHigherOneBit | rightOnePattern;

        System.out.println(next);
    }
}
