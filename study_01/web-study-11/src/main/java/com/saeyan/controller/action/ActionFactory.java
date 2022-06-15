package com.saeyan.controller.action;
// 핸들러
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
		System.out.println("ActionFactory : " + command);
		
		if (command.equals("board_list")) {
			action = new BoardListAction();
		} if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} if (command.equals("board_write")) {
			action = new BoardWriteAction();
		}
		return action;
	}
	
	
}
