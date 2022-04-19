package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.crud.dao.crud;
import com.google.gson.Gson;

/**
 * Servlet implementation class edit
 */
@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String col = request.getParameter("cust_payment_terms");
		String ord = request.getParameter("invoice_currency");
		int sno = Integer.parseInt(request.getParameter("SlNo"));
		System.out.println(col+" "+ord+" "+sno);
		HashMap<Object, Object> Response = new HashMap<Object, Object>();
		crud dbase = new crud();
		int r = dbase.edit(ord,col, sno);
		if(r>0)
			Response.put("insert", true);
		else
			Response.put("insert", false);
		Gson g = new Gson();
		String res = g.toJson(Response);
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.getWriter().print(res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
