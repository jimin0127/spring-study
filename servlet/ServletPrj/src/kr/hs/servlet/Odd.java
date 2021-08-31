package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
@WebServlet("/odd")
public class Odd extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>È¦Â¦ÆÇº°</title></head></body>");
		int a = 3;
		// aÀÇ È¦Â¦ÆÇº°ÇØ¼­ Ãâ·Â½ÃÅ°±â
		if (a % 2 == 0) {
			out.print("<h3>Â¦¼ö</h3>");
		}else {
			out.print("<h3>È¦¼ö</h3></body></html>");
		}
		
	}

}
