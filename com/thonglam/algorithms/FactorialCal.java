package com.thonglam.algorithms;

public class FactorialCal {

   static int findFac(int a){
      if(a==0){
          return 1;
      }else {
          return a * findFac(a-1);
      }
    }

    public static void main(String[] args) {
     int b= 8;
    int result= findFac(b);
        System.out.println("factorial of " +b + " is = "+result);
    }
}
