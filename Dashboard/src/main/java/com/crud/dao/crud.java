package com.crud.dao;

import java.sql.*;
import com.pojo.invoice.*;
import java.util.*;

public class crud {
	public Connection getConnection() {
		Connection conn=null;
		
		String url ="jdbc:mysql://localhost:3306/grey_goose";
		String user = "root";
		String pass ="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection(url,user,pass);
			return conn;
		} 
		catch (ClassNotFoundException e) {		
				e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public ArrayList<Invoicepojo> fetch(String doc_id, int cust_number, String invoice, String year) {
		Connection cn = getConnection();
		ResultSet rs = null;
		String d = " and doc_id="+doc_id;
		String y = " and buisness_year ="+year;
		
		ArrayList<Invoicepojo> inv = new ArrayList<Invoicepojo>();
		String qry = "Select * from winter_internship where cust_number="+cust_number;
		if(doc_id!=null)
			qry = qry+d;
		if(year!=null)
			qry = qry+y;
		try {
			Statement st = cn.createStatement();
			rs = st.executeQuery(qry);
			while(rs.next())
			{
				Invoicepojo ob = new Invoicepojo();
				ob.setSl_no(rs.getString(1));
				ob.setBusiness_code(rs.getString(2));
				ob.setCust_number(rs.getString(3));
				ob.setClear_date(rs.getString(4));
				ob.setBuisness_year(rs.getString(5));
				ob.setDoc_id(rs.getString(6));
				ob.setPosting_date(rs.getString(7));
				ob.setDocument_create_date(rs.getString(8));
				ob.setDue_in_date(rs.getString(9));
				ob.setInvoice_currency(rs.getString(10));
				ob.setDocumenttype(rs.getString(11));
				ob.setPosting_id(rs.getString(12));
				ob.setTotal_open_amount(rs.getString(13));
				ob.setBaseline_create_date(rs.getString(14));
				ob.setCust_payment_terms(rs.getString(15));
				ob.setInvoice_id(rs.getString(16));
				ob.setAgingbucket(rs.getString(17));
				
				inv.add(ob);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return inv;
	}
	
	public int add(Invoicepojo inv) {
		Connection cn = getConnection();
		ResultSet res;
		int rs=0,count;
		String q = "SELECT count(*) FROM winter_internship;";
		String qry = "Insert into winter_internship(sl_no,business_code,cust_number,clear_date,buisness_year,doc_id,posting_date,document_create_date,due_in_date,invoice_currency,document_type,posting_id,total_open_amount,baseline_create_date,cust_payment_terms,invoice_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		try {
			Statement s = cn.createStatement();
			res = s.executeQuery(q);
			res.next();
			count = res.getInt("count(*)") + 1;
			PreparedStatement st = cn.prepareStatement(qry);
			st.setInt(1, (count));
			st.setString(2,inv.getBusiness_code());
			st.setInt(3, Integer.parseInt(inv.getCust_number()));
			st.setString(4,inv.getClear_date());
			st.setString(5, inv.getBuisness_year());
			st.setInt(6, Integer.parseInt(inv.getDoc_id()));
			st.setString(7, inv.getPosting_date());
			st.setString(8, inv.getDocument_create_date());
			st.setString(9, inv.getDue_in_date());
			st.setString(10, inv.getInvoice_currency());
			st.setString(11, inv.getDocumenttype());
			st.setInt(12, Integer.parseInt(inv.getPosting_id()));
			st.setDouble(13, Double.parseDouble(inv.getTotal_open_amount()));
			st.setString(14, inv.getBaseline_create_date());
			st.setString(15, inv.getCust_payment_terms());
			st.setInt(16, Integer.parseInt(inv.getInvoice_id()));
			rs = st.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public int delete(int sno) {
		Connection cn = getConnection();
		String qry = "delete from winter_internship where sl_no = " + sno+";";
		int rs=0;
		try {
			PreparedStatement st = cn.prepareStatement(qry);
			rs = st.executeUpdate(qry);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public int edit(String curr, String cpt, int sno) {
		Connection cn = getConnection();
		String qry = "Update winter_internship set invoice_currency= ? , cust_payment_terms=? where sl_no = ?;";
		int rs=0;
		try {
			PreparedStatement st = cn.prepareStatement(qry);
			st.setString(1, curr);
			st.setString(2, cpt);
			st.setInt(3, sno);
			rs = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ArrayList<Invoicepojo> getlist() {
		Connection cn = getConnection();
		String qry;
		Statement st;
		ResultSet rs = null;
		ArrayList<Invoicepojo> inv = new ArrayList<Invoicepojo>();
		qry = "Select sl_no, business_code, cust_number, clear_date, buisness_year, doc_id, posting_date, document_create_date, due_in_date, invoice_currency, document_type, posting_id, total_open_amount, baseline_create_date, cust_payment_terms, invoice_id, aging_bucket from winter_internship;";
		try {
			st = cn.createStatement();
			rs = st.executeQuery(qry);
			while(rs.next())
			{
				Invoicepojo ob = new Invoicepojo();
				ob.setSl_no(rs.getString(1));
				ob.setBusiness_code(rs.getString(2));
				ob.setCust_number(rs.getString(3));
				ob.setClear_date(rs.getString(4));
				ob.setBuisness_year(rs.getString(5));
				ob.setDoc_id(rs.getString(6));
				ob.setPosting_date(rs.getString(7));
				ob.setDocument_create_date(rs.getString(8));
				ob.setDue_in_date(rs.getString(9));
				ob.setInvoice_currency(rs.getString(10));
				ob.setDocumenttype(rs.getString(11));
				ob.setPosting_id(rs.getString(12));
				ob.setTotal_open_amount(rs.getString(13));
				ob.setBaseline_create_date(rs.getString(14));
				ob.setCust_payment_terms(rs.getString(15));
				ob.setInvoice_id(rs.getString(16));
				ob.setAgingbucket(rs.getString(17));
				
				inv.add(ob);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return inv;
	}
}
