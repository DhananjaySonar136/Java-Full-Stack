package com.classandobject;

public class constructor {

//	constructor(){
//		System.out.println("this is constructor");
//	}
//	constructor(int a){
//		System.out.println("1 para constructor:"+a);
//	}
	static String company;
	int prod_id;
	String prod_name;
	int prod_price;
	float prod_weight;
	
	constructor(int prod_id,String prod_name,int prod_price,float prod_weight){
		this.prod_id=prod_id;
		this.prod_name=prod_name;
		this.prod_price=prod_price;
		this.prod_weight=prod_weight;
	}
	
	void show() {
		System.out.println("company name:"+company);
		System.out.println("Prod_id    :"+prod_id);
		System.out.println("Prod_name  :"+prod_name);
		System.out.println("Prod_price :"+prod_price);
		System.out.println("Prod_weight:"+prod_weight);
	}
	public static void main(String[] args) {
		constructor.company="Macho";
		constructor c=new constructor(121,"Jeans",800,1.3f);
		c.show();
		
		System.out.println("********************************");
		constructor c2=new constructor(125,"Shirt",500,0.4f);
		c2.show();
	}

}
