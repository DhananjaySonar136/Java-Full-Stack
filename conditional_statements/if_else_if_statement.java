package conditional_statements;

import java.util.Scanner;

public class if_else_if_statement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.credit card");
		System.out.println("2.debit card");
		System.out.println("3.COD");
		System.out.println("4.upi");
		System.out.println("enter choice");
		int ch=sc.nextInt();
		
		if(ch==1) {
			System.out.println("discount 10%");
		}
		else if(ch==2) {
			System.out.println("discount 5%");
		}
		else if(ch==3) {
			System.out.println("No discount");
		}
		else if(ch==4) {
			System.out.println("discount 3%");
		}
		else {
			System.err.println("enter valid choice");
		}
		
		
		
	}
}
