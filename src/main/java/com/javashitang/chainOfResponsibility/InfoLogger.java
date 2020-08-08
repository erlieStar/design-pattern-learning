package com.javashitang.chainOfResponsibility;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("Ingo:Logger" + message);
    }
}
