package com.study.servlet;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		File idFile = new File("D:\\IoTCourse\\id.txt");
		FileReader fr1 = new FileReader(idFile);
		
		File pwFile = new File("D:\\IoTCourse\\pw.txt");
		FileReader fr2 = new FileReader(pwFile);
		
		int cur = 0;
		
		boolean idCheck = false;
		boolean pwCheck = false;
		
		String memoId = "";
		String memoPw = "";
		
		while((cur = fr1.read()) != -1) {
			memoId += String.valueOf((char)cur);
		}
		while((cur = fr2.read()) != -1) {
			memoPw += String.valueOf((char)cur);
		}
		System.out.println(memoId);
		System.out.println(memoPw);
		
		if(memoId.equals(id)) {
			idCheck = true;
		}
		if(memoPw.equals(pw)) {
			pwCheck = true;
		}
		
		if(idCheck == true && pwCheck == true) {
			response.sendRedirect("MainPage");
		}else {
			System.out.println("로그인 실패");
		}
		doGet(request, response);
	}

}
