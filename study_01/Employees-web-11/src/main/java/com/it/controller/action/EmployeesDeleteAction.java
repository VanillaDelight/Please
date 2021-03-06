package com.it.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.EmployeesDAO;

public class EmployeesDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		dao.deleteEmployeesById(id);
		
		new EmployeesListAcion().execute(request, response);
	}

}
