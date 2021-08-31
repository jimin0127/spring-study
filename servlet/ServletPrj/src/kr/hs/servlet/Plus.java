package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/plus")
public class Plus extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf8");
		
		PrintWriter out = res.getWriter();
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		out.print("<h3>"+sum+"</h3>");
	}
}
