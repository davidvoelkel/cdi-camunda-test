package cdicamunda;

import javax.enterprise.inject.Specializes;
import javax.enterprise.inject.spi.InjectionPoint;

import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.cdi.impl.NamedProcessEngineServicesProducer;

@Specializes
public class MyNamedProcessEngineServicesProducer extends
		NamedProcessEngineServicesProducer {

	@Override
	public ProcessEngine processEngine(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.processEngine(ip);
	}

	@Override
	public RuntimeService runtimeService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.runtimeService(ip);
	}

	@Override
	public TaskService taskService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.taskService(ip);
	}

	@Override
	public RepositoryService repositoryService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.repositoryService(ip);
	}

	@Override
	public FormService formService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.formService(ip);
	}

	@Override
	public HistoryService historyService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.historyService(ip);
	}

	@Override
	public IdentityService identityService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.identityService(ip);
	}

	@Override
	public ManagementService managementService(InjectionPoint ip) {
		// TODO Auto-generated method stub
		return super.managementService(ip);
	}
	
}
