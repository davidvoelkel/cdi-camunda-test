package cdicamunda;

import static org.junit.Assert.*;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Before;
import org.junit.Test;

public class ProzessTest {
	@Before
	public void test() {
	}
	
	@Test
	public void testName() throws Exception {
		WeldContainer container = new Weld().initialize();
		LoanApproval prozess = container.instance().select(LoanApproval.class).get();
		prozess.start();
	}

}
