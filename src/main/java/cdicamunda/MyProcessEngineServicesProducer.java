package cdicamunda;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Specializes;
import javax.inject.Named;

import org.camunda.bpm.engine.AuthorizationService;
import org.camunda.bpm.engine.FilterService;
import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.cdi.CdiStandaloneProcessEngineConfiguration;
import org.camunda.bpm.engine.cdi.impl.ProcessEngineServicesProducer;

@Specializes
public class MyProcessEngineServicesProducer extends
		ProcessEngineServicesProducer {
	
	@Produces
	@Named
	@ApplicationScoped
	public ProcessEngine processEngine(CdiStandaloneProcessEngineConfiguration config) {
		config.setJdbcDriver("org.h2.Driver");
		config.setJdbcUrl("jdbc:h2:mem:process-engine;DB_CLOSE_DELAY=1000");
		config.setJdbcUsername("sa");
		config.setJdbcPassword("");
		config.setDatabaseSchemaUpdate("true");
		config.setJobExecutorActivate(true);
///	    <property name="deploymentResources" value="classpath*:*.bpmn" />
		return config.buildProcessEngine();
	}

	@Produces
	@Named
	@ApplicationScoped
	public RuntimeService runtimeService() {
		return processEngine().getRuntimeService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public TaskService taskService() {
		return processEngine().getTaskService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public RepositoryService repositoryService() {
		return processEngine().getRepositoryService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public FormService formService() {
		return processEngine().getFormService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public HistoryService historyService() {
		return processEngine().getHistoryService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public IdentityService identityService() {
		return processEngine().getIdentityService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public ManagementService managementService() {
		return processEngine().getManagementService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public AuthorizationService authorizationService() {
		return processEngine().getAuthorizationService();
	}

	@Produces
	@Named
	@ApplicationScoped
	public FilterService filterService() {
		return processEngine().getFilterService();
	}
}
