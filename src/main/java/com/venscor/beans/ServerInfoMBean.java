package com.venscor.beans;

public interface ServerInfoMBean {
    int getExecutedSqlCmdCount();

    void printString(String fromJConsole);

    void exec(String cmd);
}
