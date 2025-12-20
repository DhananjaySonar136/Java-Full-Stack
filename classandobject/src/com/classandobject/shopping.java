package com.classandobject;

public class shopping {
	
	int prod_id;
	String prod_name;
	int prod_price;
	double prod_weight;
	
	void set(int prod_id,String prod_name,int prod_price,double prod_weight) {
		this.prod_id=prod_id;
		this.prod_name=prod_name;
		this.prod_price=prod_price;
		this.prod_weight=prod_weight;
	}
	
	void display() {
		System.out.println("product id     :"+prod_id);
		System.out.println("product name   :"+prod_name);
		System.out.println("product price  :"+prod_price);
		System.out.println("product weight :"+prod_weight);
	}
	
	public static void main(String ar[]) {
		
		shopping s1=new shopping();
		
		s1.set(13,"Chair",800,10.3);
		s1.display();
//		System.out.println("product id     :"+s1.prod_id);
//		System.out.println("product name   :"+s1.prod_name);
//		System.out.println("product price  :"+s1.prod_price);
//		System.out.println("product weight :"+s1.prod_weight);
		System.out.println("*******************************************");

		shopping s2=new shopping();
		
		s2.set(20,"Table",2000,30.5);
		s2.display();
		
		
		System.out.println("*******************************************");

		shopping s3=new shopping();
		
		s3.set(101,"Headphone",1200,0.2);
		s3.display();
		
		System.out.println("*******************************************");
		shopping s4=new shopping();
		
		s4.set(50,"Mobile",10000,0.23);
		s4.display();
	}
}
