package com.it.controller.action;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if (command.equals("employ_list")) {
			action = new EmployListAction();
		} else if (command.equals("insert_employ_form")) {
			action = new EmployInsertFormAction();
		} else if (command.equals("employ_insert")) {
			action = new EmployInsertAction();
		} else if (command.equals("detail")) {
			action = new EmployDetailAction();
		}
		
		return action;
	}
}
