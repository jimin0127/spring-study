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
		//�Ѿ�� ���� �޾Ƽ� result=Ȧ������ ¦������
		int num = Integer.parseInt(req.getParameter("num"));
		// ����Ͻ� ���� 
		String result; //���⿡�� model�� result
		if(num% 2==0) {
			result = "¦��";
		}
		else {
			result = "Ȧ��";
		}
		// request ������ model�̶� ������ ���� result ���� �����Ѵ�. 
		req.setAttribute("model", result);
		
		
		//requestDispater�� �̿��ؼ� controller�� ���� view�� �Ѱ��ش�. 
		RequestDispatcher dispatcher = req.getRequestDispatcher("input_result.jsp");
		
		dispatcher.forward(req, res);
	}

}
