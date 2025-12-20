package com.classandobject;

public class constructor_chaining {
	
	//this()--> call is use to call another constructor
	//it should be written only on first line inside constructor
	
	constructor_chaining(){
		
		this(2);//it will call one para constructor
		System.out.println(" default constructor");//last this statement will be printed
	}
	
	constructor_chaining(int a){
		
		this(5,6);//it will call two para constructor
		System.out.println(" 1 para constructor:"+a);//second statement will be printed
	}
	
	constructor_chaining(int a,int b){
		
		System.out.println(" 2 para constructor:"+a+" "+b);//First this statement will print
	}

	public static void main(String[] args) {
		constructor_chaining c=new constructor_chaining();
	}

}
