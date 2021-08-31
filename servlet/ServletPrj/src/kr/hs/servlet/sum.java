package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sum
 */
@WebServlet("/sum")
public class sum extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(request.getParameter("num"));
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		request.setAttribute("num", num);
		request.setAttribute("sum", sum);
		RequestDispatcher dispatcher = request.getRequestDispatcher("sum_result.jsp");
		dispatcher.forward(request, response);
	}

}
