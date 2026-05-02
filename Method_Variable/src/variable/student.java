package variable;

public class student {
	
	static int count;
	static String college="SAE"; //static variable
	String name;
	String dep;              //instance variable
	int age;
	String address;
	long mobile;
	
	void setData(String name,int age,String dep,String address,long mobile) {   //instance method
		this.name=name;
		this.age=age;
		this.dep=dep;
		this.address=address;
		this.mobile=mobile;
	}
	
	void display(int x) {
		System.out.println(x);
	}
	
	void show() {
		count++;
		System.out.println("College:"+college);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Dep:"+dep);
		System.out.println("Address:"+address);
		System.out.println("Mobile:"+mobile);
		
		System.out.println("Count :"+count);
		System.out.println("*****************************");
	}
	
	static void method(int a) {   //static method
		System.out.println("This method is static method:"+a);
	}
	
	public static void main(String ar[]) {
		student s=new student();
		s.setData("Dhananjay", 20, "ID", "Pune", 1231231231l);  //called method by using object;
		method(3);//called static method without using object
		s.show(); //called instance method by using object
		
		student s2=new student();
		s2.setData("Prem", 21, "COMP", "Nandurbar", 1212121121);
		s2.show();
	
	}
}
