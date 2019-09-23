package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainPage")
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>LoginPage</TITLE><link rel='stylesheet' href='Common.css'/></HEAD>");
        out.println("<BODY>");
        out.println("<h1 style = 'text-align : center;'>환영합니다.</h1>");
        out.println("<h3 style = 'text-align : center;'>서블릿 정말 쉽죠?</h3>");
        out.println("</BODY></HTML>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
