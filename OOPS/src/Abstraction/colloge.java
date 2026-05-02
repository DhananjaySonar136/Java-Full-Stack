package Abstraction;

public abstract class colloge extends student{

	colloge(int n){
		super(n);
		System.out.println("college class constructor top class");
	}
	abstract void result();
	void fun() {
		System.out.println("Overrided fun()");
	}
	@Override
	void method() {
		System.out.println("This is a overriden methob by jumbu  "+n);
	}
	void show() {
		System.out.println("new extra show()");
	}
	
}
