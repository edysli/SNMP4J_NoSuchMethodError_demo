package ed.demo.snmp4j;

import java.io.IOException;
import org.junit.Test;
import org.snmp4j.agent.test.TestAgent;

public class AgentTest {
    @Test
    public void tryTestAgent() throws IOException {
	String[] args = {"127.0.0.1/1610"};
        TestAgent.main(args);
    }
}
