package Abstraction;

public class Main extends parent{
	
	Main(){
		super(9);
		System.out.println("Main class constructor...");
	}
	void property() {
		System.out.println("Parent has 2 car..");	
	}

	
	public static void main(String[] args) {
		Main m=new Main();
		m.fun();
		m.method();
		m.details();
		m.show();
		System.out.println(m.getnumber(6));
	}
}
