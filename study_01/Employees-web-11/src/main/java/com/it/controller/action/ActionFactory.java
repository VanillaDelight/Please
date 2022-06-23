package com.it.controller.action;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		
		if (command.equals("employees_list")) {
			action = new EmployeesListAcion();
		} else if (command.equals("employees_write_form")) {
			action = new EmployeesWriteFormAction();
		} else if (command.equals("employees_write")) {
			action = new EmployeesWriteAction();
		} else if (command.equals("employees_view")) {
			action = new EmployeesViewAction();
		} else if (command.equals("pass_check_form")) {
			action = new PassCheckFormAction();
		} else if (command.equals("pass_check")) {
			action = new PassCheckAction();
		} else if (command.equals("employees_update_form")) {
			action = new EmployeesUpdateFormAction();
		} else if (command.equals("employees_update")) {
			action = new EmployeesUpdateAction();
		} else if (command.equals("employees_delete")) {
			action = new EmployeesDeleteAction();
		}
		return action;
	}
}
