package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login2")
public class login2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String r_id = "kim";
		int r_pw = 1111;
		String id = req.getParameter("uid");
		int pw = Integer.parseInt(req.getParameter("upw"));
		
		if(r_id.equals(id) && r_pw == pw) {
			req.setAttribute("id", id);
			req.setAttribute("pw", pw);
			RequestDispatcher dispatcher = req.getRequestDispatcher("login2_result.jsp");
			dispatcher.forward(req, res);
		}else {
			
			PrintWriter out = res.getWriter();
			String str = "";
			str = "<script>location.href='login2.jsp';</script>";
			out.print(str);
		}
		
		
	}

}
