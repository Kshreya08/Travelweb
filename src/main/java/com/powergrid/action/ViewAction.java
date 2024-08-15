package com.powergrid.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.powergrid.db.dbconnection3;

public class ViewAction extends ActionSupport {
	
	private String bookingid;
	private String retmessage="";
	private List<String> selectdata = null;
	private String recid;
	private String empname;
	private String empphone;
	private String empid;
	private String depdate;
	private String retdate;
	private String deptfrm;
	private String goingto;
	private String trip;
	private String travelclass;
	private String email;
	
	
	public String execute() 
	{
		dbconnection3 dbselect = new dbconnection3();
		
		/*if (this.bookingid == null || this.bookingid.equalsIgnoreCase(""))
		{
			System.out.println("bookingid"+bookingid);
			addActionError(getText("error.bookingid"));
			retmessage = "error";
		}*/
		
		this.selectdata = dbselect.getbookingrecord(this.bookingid);
		if(this.selectdata != null)
		{
			this.setRecid(selectdata.get(0));
			this.setEmpname(selectdata.get(1));
			this.setEmpphone(selectdata.get(2));
			this.setEmpid(selectdata.get(3));
			this.setDepdate(selectdata.get(4));
			this.setRetdate(selectdata.get(5));
			this.setDeptfrm(selectdata.get(6));
			this.setGoingto(selectdata.get(7));
			this.setTrip(selectdata.get(8));
			this.setTravelclass(selectdata.get(9));
			this.setEmail(selectdata.get(10));
			
		}
		

		return SUCCESS;
	}
	
	public String input()
	{
		return INPUT;
	}
	
	public String getbookingid() 
	{
	return bookingid;
	}
	
	public void setbookingid(String bookingid)
	{
		this.bookingid = bookingid;
	}

	public String getBookingid() {
		return bookingid;
	}

	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}

	public String getRetmessage() {
		return retmessage;
	}

	public void setRetmessage(String retmessage) {
		this.retmessage = retmessage;
	}

	public List getSelectdata() {
		return selectdata;
	}

	public void setSelectdata(List selectdata) {
		this.selectdata = selectdata;
	}

	public String getRecid() {
		return recid;
	}

	public void setRecid(String recid) {
		this.recid = recid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpphone() {
		return empphone;
	}

	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getDepdate() {
		return depdate;
	}

	public void setDepdate(String depdate) {
		this.depdate = depdate;
	}

	public String getRetdate() {
		return retdate;
	}

	public void setRetdate(String retdate) {
		this.retdate = retdate;
	}

	public String getDeptfrm() {
		return deptfrm;
	}

	public void setDeptfrm(String deptfrm) {
		this.deptfrm = deptfrm;
	}
	public String getGoingto() {
		return goingto;
	}

	public void setGoingto(String goingto) {
		this.goingto = goingto;
	}
	

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public String getTravelclass() {
		return travelclass;
	}

	public void setTravelclass(String travelclass) {
		this.travelclass = travelclass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
