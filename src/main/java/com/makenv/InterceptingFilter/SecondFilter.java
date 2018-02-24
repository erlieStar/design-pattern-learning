package com.makenv.InterceptingFilter;

public class SecondFilter implements Filter {
    public void execute(String request) {
        System.out.println("SecondFilter " + request);
    }
}
