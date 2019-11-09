package com.javashitang.InterceptingFilter;

public class SecondFilter implements Filter {
    public void execute(String request) {
        System.out.println("SecondFilter " + request);
    }
}
