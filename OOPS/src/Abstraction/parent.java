package Abstraction;

public abstract class parent extends colloge {

	parent(int n){
		super(n);
		System.out.println("Parent class constructor top class");
	}
	
	@Override
	void result() {
		
	}
	abstract void property();
	void method() {
		System.out.println("this is a method od parent class");
	}
	
	int getnumber(int n) {
		return 5;
	}
}
