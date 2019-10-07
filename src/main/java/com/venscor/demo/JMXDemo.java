package com.venscor.demo;

import com.venscor.beans.ServerInfo;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import java.lang.management.ManagementFactory;
import java.rmi.registry.LocateRegistry;

/**
 * @author: Venscor
 * @date: 2019/10/7
 * @description
 */
public class JMXDemo {
    public static void main(String[] args)  throws JMException, Exception{
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("serverInfoMBean:name=serverInfo");
        server.registerMBean(new ServerInfo(), name);


        LocateRegistry.createRegistry(8081);
        JMXServiceURL url = new JMXServiceURL
                ("service:jmx:rmi:///jndi/rmi://localhost:8081/jmxrmi");
        JMXConnectorServer jcs = JMXConnectorServerFactory.newJMXConnectorServer(url, null, server);
        jcs.start();
    }
}
