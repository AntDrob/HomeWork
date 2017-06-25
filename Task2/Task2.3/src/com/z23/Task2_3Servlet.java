package com.z23;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task2_3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		int array[][] = new int [8][5];
		int a = 10, b = 89;
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 5; j++){
				array[i][j] = a + (int) (Math.random() * b);
				resp.getWriter().print( array[i][j] + "       "+ "  ");
			}
			resp.getWriter().print("<p>");
		}

	}
}
