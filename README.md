SNMP4J_NoSuchMethodError_demo
=============================

Minimal Maven project to trigger an error while running the TestAgent class from SNMP4J-Agent 2.1.0 in combination with different versions of SNMP4J. Change the version of org.snmp4j:snmp4j in the POM file and run "mvn clean test" to try.

# With SNMP4J 2.2.4
Output of "mvn clean test":

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running ed.demo.snmp4j.AgentTest
0 [main] DEBUG org.snmp4j.security.Salt  - Initialized Salt to c9496eb1e130f866.
Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.491 sec <<< FAILURE! - in ed.demo.snmp4j.AgentTest
tryTestAgent(ed.demo.snmp4j.AgentTest)  Time elapsed: 0.396 sec  <<< ERROR!
java.lang.NoSuchMethodError: org.snmp4j.security.SecurityProtocols.addDefaultProtocols()V
	at org.snmp4j.agent.BaseAgent.initMessageDispatcher(BaseAgent.java:384)
	at org.snmp4j.agent.BaseAgent.init(BaseAgent.java:145)
	at org.snmp4j.agent.test.TestAgent.main(TestAgent.java:458)
	at ed.demo.snmp4j.AgentTest.tryTestAgent(AgentTest.java:11)

Results :

Tests in error: 
  AgentTest.tryTestAgent:11 » NoSuchMethod org.snmp4j.security.SecurityProtocols...

Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
```

# With SNMP4J 2.2.3
This error does not happen when using SNMP4J 2.2.3.

Output of "mvn clean test":

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running ed.demo.snmp4j.AgentTest
0 [main] DEBUG org.snmp4j.security.Salt  - Initialized Salt to f878f902c1bff4f2.
[... skipped debug messages ...]
793 [DefaultUDPTransportMapping_127.0.0.1/1610] DEBUG org.snmp4j.transport.DefaultUdpTransportMapping  - UDP receive buffer size for socket 127.0.0.1/1610 is set to: 106496
```
