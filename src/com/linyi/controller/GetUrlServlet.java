package com.linyi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.linyi.daoimpl.GetMusicUrlDaoImpl;
import com.linyi.server.GetMusicUrlServer;

/**
 * Servlet implementation class GetUrlServlet
 */
@WebServlet("/GetUrlServlet")
public class GetUrlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetUrlServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String input_url = request.getParameter("input_url");
		GetMusicUrlServer gmus = new GetMusicUrlServer(new GetMusicUrlDaoImpl());
		String audio = gmus.GetUrl(input_url);
		out.print(audio);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
