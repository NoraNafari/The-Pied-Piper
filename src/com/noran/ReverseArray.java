package com.noran;

public class ReverseArray {

    public String reverse(String firstList){
        StringBuilder builder = new StringBuilder();
        return builder.append(firstList).reverse().toString();
    }
}
