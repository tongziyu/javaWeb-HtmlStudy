package com.java.yixuexi.exception;

public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super("自己的异常类执行了:"+message);
    }
}
