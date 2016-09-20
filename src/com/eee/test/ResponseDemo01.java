package com.eee.test;

import java.io.IOException;
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseDemo01
 */
public class ResponseDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		outputChineseByPrinterWriter(response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void outputChineseByPrinterWriter(HttpServletResponse response) throws IOException{
		String data="ÖÐ¹ú";
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		response.setHeader("content-type", "text/html;charset=UTF-8");
		//out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'/>");
		out.write(data);
	}
	

}
