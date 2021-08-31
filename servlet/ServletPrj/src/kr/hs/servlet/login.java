package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<h3>아이디 : " + req.getParameter("id") + "</h3>");
		
		out.print("<h3>비밀번호 : " + req.getParameter("pw") + "</h3>");
		out.print("<h3>이름 : " + req.getParameter("name") + "</h3>");
		
		String[] hobbies = req.getParameterValues("hobby");
		
		out.print("<h3>취미 ");
		for(String hobby : hobbies) {
			out.print(hobby + "  ");
		}
		out.print("</h3>");
		
		out.print("<h3>성별 : " + req.getParameter("sex") + "</h3>");
		

		out.print("<h3>직업 : " + req.getParameter("job") + "</h3>");
		
		out.print("<h3>자기소개 : " + req.getParameter("intro") + "</h3>");




	}

}
