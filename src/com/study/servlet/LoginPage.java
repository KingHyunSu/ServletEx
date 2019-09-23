package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>LoginPage</TITLE><link rel='stylesheet' href='Common.css'/></HEAD>");
        out.println("<BODY>");
        out.println("<div class = 'login'>");
        out.println("<div class = 'login-head'>로그인</div>");
        out.println("<div class = 'login-body'>");
        out.println("<form action = 'LoginAction' method = 'POST'>");
        out.println("<div class = 'text-input'>");
        out.println("&nbsp;&nbsp; 아이디 : <input type = 'text' name = 'id'>");
        out.println("</div>");
        out.println("<div class = 'text-input' style = 'margin-bottom : 35px;'>");
        out.println("비밀번호 : <input type = 'text' name = 'pw'>");
        out.println("</div>");
        out.println("<input class = 'login-button' type = 'submit' value = '로그인'>");
        out.println("</form>");
        out.println("<button class = 'join-button' type = 'button' onclick=\"location.href='JoinPage'\">회원가입</button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</BODY></HTML>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
