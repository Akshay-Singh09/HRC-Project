package com.pojo.invoice;

public class Invoicepojo {
	private String sl_no;
	private String business_code;
	private String cust_number;
	private String clear_date;
	private String buisness_year;
	private String doc_id;
	private String posting_date;
	private String document_create_date;
	private String due_in_date;
	private String invoice_currency;
	private String documenttype;
	private String posting_id;
	private String total_open_amount;
	private String baseline_create_date;
	private String cust_payment_terms;
	private String Invoice_id;
	private String Agingbucket;
	
	public String getSl_no() {
		return sl_no;
	}
	
	public void setSl_no(String sl_no) {
		this.sl_no = sl_no;
	}
	
	public String getBusiness_code() {
		return business_code;
	}
	
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
	
	public String getCust_number() {
		return cust_number;
	}
	
	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}
	
	public String getClear_date() {
		return clear_date;
	}
	
	public void setClear_date(String clear_date) {
		this.clear_date = clear_date;
	}
	
	public String getBuisness_year() {
		return buisness_year;
	}
	
	public void setBuisness_year(String buisness_year) {
		this.buisness_year = buisness_year;
	}
	
	public String getDoc_id() {
		return doc_id;
	}
	
	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	
	public String getPosting_date() {
		return posting_date;
	}
	
	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}
	
	public String getDocument_create_date() {
		return document_create_date;
	}
	
	public void setDocument_create_date(String document_create_date) {
		this.document_create_date = document_create_date;
	}
	
	public String getDue_in_date() {
		return due_in_date;
	}
	
	public void setDue_in_date(String due_in_date) {
		this.due_in_date = due_in_date;
	}
	
	public String getInvoice_currency() {
		return invoice_currency;
	}
	
	public void setInvoice_currency(String invoice_currency) {
		this.invoice_currency = invoice_currency;
	}
	
	public String getDocumenttype() {
		return documenttype;
	}
	
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}
	
	public String getPosting_id() {
		return posting_id;
	}
	
	public void setPosting_id(String posting_id) {
		this.posting_id = posting_id;
	}
	
	public String getTotal_open_amount() {
		return total_open_amount;
	}
	
	public void setTotal_open_amount(String total_open_amount) {
		this.total_open_amount = total_open_amount;
	}
	
	public String getBaseline_create_date() {
		return baseline_create_date;
	}
	
	public void setBaseline_create_date(String baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}
	
	public String getCust_payment_terms() {
		return cust_payment_terms;
	}
	
	public void setCust_payment_terms(String cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}
	
	public String getInvoice_id() {
		return Invoice_id;
	}
	
	public void setInvoice_id(String invoice_id) {
		Invoice_id = invoice_id;
	}
	
	public String getAgingbucket() {
		return Agingbucket;
	}
	
	public void setAgingbucket(String agingbucket) {
		Agingbucket = agingbucket;
	}
	
	public Invoicepojo(String cust_number, String clear_date, String buisness_year, String doc_id, String posting_date,
			String document_create_date, String due_in_date, String invoice_currency, String documenttype,
			String posting_id, String total_open_amount, String baseline_create_date, String cust_payment_terms,
			String invoice_id, String agingbucket) {
		super();
		this.cust_number = cust_number;
		this.clear_date = clear_date;
		this.buisness_year = buisness_year;
		this.doc_id = doc_id;
		this.posting_date = posting_date;
		this.document_create_date = document_create_date;
		this.due_in_date = due_in_date;
		this.invoice_currency = invoice_currency;
		this.documenttype = documenttype;
		this.posting_id = posting_id;
		this.total_open_amount = total_open_amount;
		this.baseline_create_date = baseline_create_date;
		this.cust_payment_terms = cust_payment_terms;
		Invoice_id = invoice_id;
		Agingbucket = agingbucket;
	}

	public Invoicepojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Invoice [sl_no=" + sl_no + ", business_code=" + business_code + ", cust_number=" + cust_number
				+ ", clear_date=" + clear_date + ", buisness_year=" + buisness_year + ", doc_id=" + doc_id
				+ ", posting_date=" + posting_date + ", document_create_date=" + document_create_date + ", due_in_date="
				+ due_in_date + ", invoice_currency=" + invoice_currency + ", documenttype=" + documenttype
				+ ", posting_id=" + posting_id + ", total_open_amount=" + total_open_amount + ", baseline_create_date="
				+ baseline_create_date + ", cust_payment_terms=" + cust_payment_terms + ", Invoice_id=" + Invoice_id
				+ ", Agingbucket=" + Agingbucket + "]";
	}
}
