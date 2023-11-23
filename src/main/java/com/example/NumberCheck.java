package com.example;

public class NumberCheck {
    public String check(int i) {
        if (i < 0) {
            return "Negative";
        } else if (i == 0){
            return "Equal";
        }
        return "Positive";
    }
}
