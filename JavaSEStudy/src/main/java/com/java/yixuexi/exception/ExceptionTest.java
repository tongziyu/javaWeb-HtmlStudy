package com.java.yixuexi.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        int array[] = new int[10];
        getElement(array,11);

    }
    public static int getElement(int[] arr,int index){
        return arr[index] ;

    }
}
