package com.it.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.MovieDAO;
import com.it.dto.MovieVO;

@WebServlet("/delete.do")
public class MovieDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));
		
		MovieDAO mDao = MovieDAO.getInstance();
		MovieVO mVo = mDao.getMovieDetail(code);
		
		request.setAttribute("movie", mVo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("movie/movieDelete.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));
		
		MovieDAO mDao = MovieDAO.getInstance();
		int result = mDao.deleteMovie(code);
		
		if (result == 1) {
			response.sendRedirect("movieList.do");
		} else {
			System.out.println("삭제 실패");
		}
	}
}
