package com.study.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinAction")
public class JoinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		try {
			OutputStream os1 = new FileOutputStream("D:\\IoTCourse\\id.txt");
			OutputStream os2 = new FileOutputStream("D:\\IoTCourse\\pw.txt");
			byte[] by1 = id.getBytes();
			byte[] by2 = pw.getBytes();
			os1.write(by1);
			os2.write(by2);
			
			response.sendRedirect("LoginPage");
		}catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
