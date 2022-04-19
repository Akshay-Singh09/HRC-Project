package com.servlet;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.dao.crud;
import com.google.gson.Gson;
import com.pojo.invoice.Invoicepojo;

/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HashMap<Object, Object> Response = new HashMap<Object, Object>();
		Invoicepojo inv = new Invoicepojo();
		inv.setBusiness_code(request.getParameter("BusinessCode"));
		inv.setCust_number(request.getParameter("custNumber"));
		inv.setClear_date(request.getParameter("clearDate"));
		inv.setBuisness_year(request.getParameter("buisnessYear"));
		inv.setDoc_id(request.getParameter("docId"));
		inv.setPosting_date(request.getParameter("postingDate"));
		inv.setDocument_create_date(request.getParameter("docCreateDate"));
		inv.setDue_in_date(request.getParameter("dueInDate"));
		inv.setInvoice_currency(request.getParameter("invoiceCurr"));
		inv.setDocumenttype(request.getParameter("docType"));
		inv.setPosting_id(request.getParameter("postingId"));
		inv.setTotal_open_amount(request.getParameter("totalOpenAmount"));
		inv.setBaseline_create_date(request.getParameter("baselineCreateDate"));
		inv.setCust_payment_terms(request.getParameter("custPaymentTerms"));
		inv.setInvoice_id(request.getParameter("invoiceId"));
		crud dbase = new crud();
		int n = dbase.add(inv);
		if(n>0)
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
