package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request")
public class request extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = res.getWriter();
		
		out.print("<h3>request URI : " + req.getRequestURI() + "</h3>");
		out.print("<h3>Server name : " + req.getServerName() + "</h3>");
		out.print("<h3>Server Port : " + req.getServerPort() + "</h3>");
		out.print("<h3>client addr : " + req.getRemoteAddr() + "</h3>");
		out.print("<h3>client Host : " + req.getRemoteHost() + "</h3>");
		out.print("<h3>client Port : " + req.getRemotePort() + "</h3>");

	}
}
