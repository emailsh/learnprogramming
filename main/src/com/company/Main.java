package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double d1 = 20.00d;
        double d2 = 80.00d;
        double result1 = d1 + d2 * 100.00d;
        double re = result1 % 40.00d;

        boolean isZero =re== 0?true:false;
        System.out.println(isZero);
        if (!isZero){
            System.out.println("Got some remainder!");
        }
    }
}
