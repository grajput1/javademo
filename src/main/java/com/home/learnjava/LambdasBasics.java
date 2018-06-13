package com.home.learnjava;

public class LambdasBasics {

    public static void main(String [] args){
         MyAdd addFunction = (int a, int b) -> a + b;

         System.out.println(addFunction.too(8, 10));

    }
    interface MyAdd{
        int too(int a, int b);
    }
}
