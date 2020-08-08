package com.javashitang.chainOfResponsibility;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();
        //Ingo:Loggerinfo level
        loggerChain.logMessage(AbstractLogger.INFO, "info level");
        System.out.println();
        //Debug:Loggerdebug level
        //Ingo:Loggerdebug level
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug level");
        System.out.println();
        //Error:Loggererror level
        //Debug:Loggererror level
        //Ingo:Loggererror level
        loggerChain.logMessage(AbstractLogger.ERROR, "error level");
    }
}
