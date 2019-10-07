package com.venscor.beans;

import java.io.IOException;

/**
 * @author: Venscor
 * @date: 2019/10/7
 * @description
 */
public class ServerInfo implements ServerInfoMBean {

    private int executedSqlCmdCount;

    public int getExecutedSqlCmdCount() {
        return 100;
    }

    public void setExecutedSqlCmdCount(int executedSqlCmdCount) {
        this.executedSqlCmdCount = executedSqlCmdCount;
    }

    public void printString(String fromJConsole) {
        System.out.println(fromJConsole);
    }

    // 要执行的方法必须注册于MBean
    public void exec(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exec2(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
