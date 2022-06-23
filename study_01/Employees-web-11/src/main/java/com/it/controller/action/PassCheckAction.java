package com.it.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.EmployeesDAO;
import com.it.dto.EmployeesVO;

public class PassCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		EmployeesDAO dao = EmployeesDAO.getInstance();
		EmployeesVO vo = dao.getDetailById(id);
		
		if (pass.equals(vo.getPass())) {
			url = "/employees/successPass.jsp";
		} else {
			url = "/employees/passCheckForm.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
