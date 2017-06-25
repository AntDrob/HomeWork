package com.z2.myproj;

import java.io.IOException;


import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task2_1Servlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse resp)
			 throws IOException {
	 	
	 	 resp.setContentType("text/html;charset=UTF-8");
	 	 String var1 = req.getParameter("var1");
	 	 int integer1 = Integer.parseInt(var1);
	 	
	 	 String var2 = req.getParameter("var2");
	 	 int integer2 = Integer.parseInt(var2);
				
	 	 int diif1 = Math.abs(10 - integer1);
	 	 int diif2 = Math.abs(10 - integer2);

	 	 if (diif1 < diif2){
	 		resp.getWriter().println(integer1);
	 	 } else {
	 	 	if(diif2 == diif1) 
	 	 		resp.getWriter().println("Расстояние до 10 одинакого");
	 	 	else {
	 	 		resp.getWriter().println(integer2);
	 		}
	 	 }
	 	
}
}
