package com.javashitang.ChainOfResponsibility;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("Debug:Logger" + message);
    }
}
