package method;

import java.util.Scanner;

public class methodtype {
	
	static String shop="Gaurav shop";
	String prod_name;
	int prod_price;
	void take(){//instance method
		Scanner sc=new Scanner(System.in);
		System.out.println("Product name :");
		prod_name=sc.next();
		System.out.println("Product price:");
		prod_price=sc.nextInt();
	}
	
	static void shopshow() {//static method
		System.out.println("Show Name : "+shop);
	}
	
	void show() { //instance method
		System.out.println("Product name :"+prod_name);
		System.out.println("Product price:"+prod_price);
	}
	public static void main(String ar[]) {
		
		methodtype mt=new methodtype();
		mt.prod_name="Jeans";
		mt.prod_price=1000;
		shopshow();
		mt.take();
		mt.show();
		
		
	}
}
