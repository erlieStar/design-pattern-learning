package com.makenv.InterceptingFilter;

public class Target {
    public void execute(String request) {
        System.out.println("Target " + request);
    }
}