package Abstraction;

public abstract class student {

	student(int n){
		System.out.println("Student class constructor top class:"+n);
	}
	public int n=5;
	void fun() {
		System.out.println("Hello java this is parent method");
	}
	
	abstract void method();
	abstract int getnumber(int n);
	void details() {
		System.out.println("Name : Dhananjay");
	}
}
