package com.powergrid.db;

public class Employee {
	
	private String Name;
	private String Job;
	private String Tittle;
	private int salary;
	
	public Employee(String Name,String Job,String Tittle,int salary)
	{
		this.Name=Name;
		this.Job=Job;
		this.Tittle=Tittle;
		this.salary=salary;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	public String getJob() {
	return Job;
	}
	
	public void setJob(String Job)
	{
		this.Job=Job;
	}
	public String getTittle() {
		return Tittle;
	}
	public void setTittle(String Tittle)
	{
		this.Tittle=Tittle;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}

	public void display()
	{
		System.out.println("The Name of the Employee: "+ Name + ", Job and Tittle: " + Job + "("+ Tittle +")" + " and Salary is: " + salary);
	}
	
	public static void main(String[] args)
	{
		Employee details = new Employee("shreya singh","Software engineer","Junior Engineer",1000000);
		details.display();
		
		Employee details2 = new Employee("Lavanya Sharma","Software engineer", "Junior Engineer",1000000);
		details2.display();		
		
	}
	

}
