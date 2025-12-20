package conditional_statements;

import java.util.Scanner;

public class if_statement {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String s=sc.next();
		System.out.println(s.charAt(0));
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('D'));
		if(s.length()>5) {
			System.err.println("excecuted");
		}
		
		if(5<10 && 30<50) {
			System.out.println("true");
		}
	}
}
