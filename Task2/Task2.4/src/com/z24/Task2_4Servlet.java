package com.z24;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task2_4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");

		int array[][] = new int [5][8];
		int a = -99, b = 99;
		
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 8; j++)
				array[i][j] = a + (int) (Math.random() * (b - a));
				
		int max = array[0][0];
		
		resp.getWriter().print("Array content:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				resp.getWriter().print("   " + array[i][j] );
				max = (max > array[i][j]) ? max : array[i][j];
			}
			resp.getWriter().print("<p>");
		}
		
		resp.getWriter().print("Biggest array element: " + max);
	}
}
