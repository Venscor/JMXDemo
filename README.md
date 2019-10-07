# JMX 对外开放危害

JMX（Java Management Extensions），能够管理Java应用程序。

JMX能够获取应用程序的beans，还能执行应用程序的一些方法。方法需要在XXXMBean接口中定义。

## 黑盒扫描
端口嗅探，略。。（多数通过JDNI，因此更多关注RMI，LDAP等端口，当然全量扫不会漏）

### 更多危害：

https://www.secpulse.com/archives/55367.html