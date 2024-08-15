package com.powergrid.action;

import com.opensymphony.xwork2.ActionSupport;
import com.powergrid.db.dbconnection3;

public class BookingAction extends ActionSupport {
    private String name;
    private String number;
    private String email;
    private String retmessage="";
    private String empname;
    private String phonenumber;
	private String empid;
    private String empemail;
    private String depdate;
    private String returndate;
    private String depfrom;
    private String goingto;
    private String trip;
    private String bookclass;
    

	public String execute() {
		
		String retmessage = "success";
		dbconnection3 dbinsert = new dbconnection3();
		
		if (this.empname == null || this.empname.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.empname"));
    		retmessage = "error";
    	}
    	if (this.phonenumber == null || this.phonenumber.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.phonenumber"));
    		retmessage = "error";
    	}
    	if (this.empemail == null || this.empemail.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.empemail"));
    		retmessage = "error";
    	}
    	if (this.empid == null || this.empid.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.empid"));
    		retmessage = "error";
    	}
    	if (this.depdate == null || this.depdate.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.depdate"));
    		retmessage = "error";
    	}
    	if (this.returndate == null || this.returndate.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.returndate"));
    		retmessage = "error";
    	}
    	if (this.depfrom == null || this.depfrom.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.depfrom"));
    		retmessage = "error";
    	}
    	if (this.goingto == null || this.goingto.equalsIgnoreCase(""))
    	{
    		addActionError(getText("error.goingto"));
    		retmessage = "error";
    	}
    	
    	if (retmessage.equalsIgnoreCase("success"))
    	{
    		dbinsert.insert(this.empname, this.phonenumber, this.empid, this.depdate, this.returndate, this.depfrom, this.goingto,  this.trip, this.bookclass, this.email);
    	}
    		
    	return retmessage;
		
	}
	
 
    
    
    
    public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpemail() {
	return empemail;
}


public void setEmpemail(String empemail) {
	this.empemail = empemail;
}
public String getDepdate() {
	return depdate;
}


public void setDepdate(String depdate) {
	this.depdate = depdate;
}

public String getReturndate() {
	return returndate;
}


public void setReturndate(String returndate) {
	this.returndate = returndate;
}

public String getGoingto() {
	return goingto;
}


public void setGoingto(String goingto) {
	this.goingto = goingto;
}


public String getDepfrom() {
	return depfrom;
}


public void setDepfrom(String depfrom) {
	this.depfrom = depfrom;
}

public String getTrip() {
	return trip;
}
public void settrip(String trip) {
	this.trip = trip;
}

public String getbookclass() {
	return bookclass;
}
public void setbookclass(String bookclass) {
	this.bookclass = bookclass;
}





	
}

