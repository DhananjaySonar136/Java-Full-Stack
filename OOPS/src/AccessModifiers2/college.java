package AccessModifiers2;

import AccessModifiers.student;

public class college extends teachers{

	
	public static void main(String[] args) {
		teachers t=new teachers();
		t.display();
		
		student s=new student();
		//System.out.println(s.n);//private variable is not access in other package
		college c=new college();
		//c.fun();//protected methos in student we have to extends that class
		
		
		
		c.fun1();
	}
}
