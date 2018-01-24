package com.vidwath;

public class Main {

    public static void main(String[] args) {
        // width 32 bit
	    int myIntValue = 5;
	    // width 32 bit
	    float myFloatValue = 5f / 2f;
	    // width 64 bit
	    double myDoubleValue = 5d / 2f;
        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyFloatValue = "+myFloatValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);

        // variable for pound
        float myPoundValue = 120f;
        float myKGValue = myPoundValue * 0.45359237f;
        System.out.println("KG value = "+ myKGValue );
    }
}
