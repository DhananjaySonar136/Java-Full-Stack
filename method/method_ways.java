package method;

public class method_ways {
	
	//method without return type and without parameter
	void fun() {
		System.out.println("This does not return and no parameter");
	}
	
	//method without return type and with parameter
	void display(int a,int b) {
		System.out.println(a+" "+b);
	}
	
	//method with return type and without parameter
	//return variable datatype and return datatype should be same
	int show() {
		return 5;
	}
	
	//method with return type and with parameter
	String show2(String name) {
		return name;
	}
	
	public static void main(String arg[]) {
		method_ways mw=new method_ways();
		
		mw.fun();
		mw.display(12,13);
		
		int val=mw.show();
		System.out.println("Val:"+val);
		
		String name=mw.show2("Prem");
		System.out.println("Name:"+name);
	}
}
