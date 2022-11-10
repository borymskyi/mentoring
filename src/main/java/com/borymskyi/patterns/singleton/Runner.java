package com.borymskyi.patterns.singleton;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        ProgrammLogger.getProgrammLogger().addLogInfo("First log..");
        ProgrammLogger.getProgrammLogger().addLogInfo("Second log..");
        ProgrammLogger.getProgrammLogger().addLogInfo("Third log..");
        ProgrammLogger.getProgrammLogger().addLogInfo("Fourth log..");

        ProgrammLogger.getProgrammLogger().showLogFile();
    }
}
