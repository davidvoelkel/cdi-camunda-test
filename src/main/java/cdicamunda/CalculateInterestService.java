package cdicamunda;


import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class CalculateInterestService implements JavaDelegate {
	
	public void execute(DelegateExecution delegate) throws Exception {
		
		System.out.println("CDI Bean invoked.");
		
	}

}
