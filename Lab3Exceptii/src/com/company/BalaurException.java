package com.company;

public class BalaurException extends Exception {
    BalaurException(int value, String errorMessage){
        System.err.println(value+errorMessage);
    }

    public BalaurException(float value, String errorMessage) {
        System.err.println(value+errorMessage);
    }
}

