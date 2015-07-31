package cdicamunda;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;

public class LoanApproval {
	
	public LoanApproval() {
	}
	
	@Inject ProcessEngine engine;

	@PostConstruct
	public void deploy() {
		RepositoryService repoService = engine.getRepositoryService();
		repoService.createDeployment().addClasspathResource("loanApproval.bpmn")
			.deploy();

	}
	
	public void start() {
		engine.getRuntimeService().startProcessInstanceByKey("loanApproval");
	}

}
