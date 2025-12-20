package variable;

public class demo {
	
	static String company;
	
//	String name;    //instance variables
//	String address;
	int age;

	//salary is local variable
	void show(int salary) {
		System.out.println("salary:"+salary);
	}
	
//	void display() {
//		System.out.println(salary);//not accessible local variable
//	}
	
	public static void main(String[] args) {
		
		demo.company="Gaurav Company";
		
		String name;
//		int age; //local variables for class
		demo d=new demo();
		d.age=20;
		name="Dhananjay";
		//address="Pune";
		
		
		System.out.println("*******Welcome*******");
		System.out.println("Company Name:"+company);
		System.out.println("Name        :"+name);
		//System.out.println(address);
		System.out.println("Age         :"+d.age);
		d.show(1000000);

	}

}
