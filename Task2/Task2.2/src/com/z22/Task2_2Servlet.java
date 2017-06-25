package com.z22;

import java.io.IOException;


import javax.servlet.http.*;



@SuppressWarnings("serial")
public class Task2_2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		int a = Integer.parseInt(req.getParameter("var1"));
		int b = Integer.parseInt(req.getParameter("var2"));
		int c = Integer.parseInt(req.getParameter("var3"));

		double d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			resp.getWriter().println("Корней нет");
		} else {
			double root1 = (-b + Math.pow(d, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(d, 0.5)) / (2 * a);
			resp.getWriter().println("Первый корень " + root1 + "<p>");
			resp.getWriter().println("Второй корень " + root2);
		}
	}
}
