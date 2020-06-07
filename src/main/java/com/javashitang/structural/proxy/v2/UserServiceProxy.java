package com.javashitang.structural.proxy.v2;

public class UserServiceProxy extends UserService {

    @Override
    public void request() {
        long startTime = System.currentTimeMillis();
        super.request();
        System.out.println("reques cost :" + (System.currentTimeMillis() - startTime));
    }

    public static void main(String[] args) {
        UserService userService = new UserServiceProxy();
        // this is userService
        // reques cost :1
        userService.request();
    }
}
