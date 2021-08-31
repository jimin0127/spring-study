package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class input extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//넘어온 값을 받아서 result=홀수인지 짝수인지
		int num = Integer.parseInt(req.getParameter("num"));
		// 비즈니스 로직 
		String result; //여기에서 model은 result
		if(num% 2==0) {
			result = "짝수";
		}
		else {
			result = "홀수";
		}
		// request 영역에 model이란 변수를 만들어서 result 값을 대입한다. 
		req.setAttribute("model", result);
		
		
		//requestDispater을 이용해서 controller의 값을 view로 넘겨준다. 
		RequestDispatcher dispatcher = req.getRequestDispatcher("input_result.jsp");
		
		dispatcher.forward(req, res);
	}

}
