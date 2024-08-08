package com.thonglam;

import java.util.Arrays;

public class ArrayToUpperCase {


    public void arrayConvertToUpperCase(String[] input){
        for(int i=0; i<input.length; i++){
            input[i] = input[i].toUpperCase();
        }
    }


    public static void incrementArray(int[] input){
      Arrays.stream(input).map(i -> i + 1).forEach(s-> System.out.print(s+" "));
    }


    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        incrementArray(a);
    }
}
