package com.powergrid.db;


 public class calculation {
	 
	 int a =34;
	 int b =17;
	 
	 void  multiply(int x,int y) {
		 int multiply= x * y;
		 System.out.println("1----"+x);
		 System.out.println("2---"+y);
		 System.out.println("3---"+multiply);
	 }
	 
	 void divide(int i,int j) {
		 int divide= i / j;
		 System.out.println("value:"+divide);
		 
		 
	 }
	 public static void main(String args[])
	 {
		 calculation product1 = new calculation();
		 calculation val = new calculation();
		 
		 product1.multiply(product1.a,product1.b);
		 product1.multiply(199, product1.a);
		 product1.multiply(300,589);
		 product1.multiply(156,product1.a);
		 val.divide(20, 20);
		 val.divide(500, val.a);
		 val.divide(1000, val.b);
		 
	 }
	  
 }
	 
 