package com.it.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.EmployeesDAO;
import com.it.dto.EmployeesVO;

public class EmployeesUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/employees/employeesUpdate.jsp";
		String id = request.getParameter("id");
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		EmployeesVO vo = dao.getDetailById(id);
		
		request.setAttribute("employees", vo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
