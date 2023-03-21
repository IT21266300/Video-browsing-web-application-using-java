package com.videoCtrl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
	
		HttpSession session = request.getSession(true);
		
		try {
		
		List<Profile> profile = LoginCtrl.validate(user, pass);
//		request.setAttribute("profile", profile);
		
		Profile username = profile.get(0);
		String str = username.getFname() + " " + username.getLname();
		String str1 = username.getUserName();
		
		session.setAttribute("username", str);
		session.setAttribute("username1", str1);
		
		response.sendRedirect("index.jsp");
		response.sendRedirect("videoPlayer.jsp");
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
//		dis.forward(request, response);
		
		
	}

}
