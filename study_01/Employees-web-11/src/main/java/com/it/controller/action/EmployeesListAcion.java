package com.it.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.EmployeesDAO;
import com.it.dto.EmployeesVO;

public class EmployeesListAcion implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/employees/employeesList.jsp";
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		List<EmployeesVO> list = dao.getAllList();
		
		request.setAttribute("employees", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
