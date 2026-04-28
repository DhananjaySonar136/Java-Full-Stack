package conditional_statements;
import java.util.*;
public class if_else_statement {
	public static void main(String[] args) {
		
//		int age=17;
//		if(age>17 || age==18) {
//			System.out.println("eligible for voting");
//		}
//		else {
//			System.out.println("not eligible for voting");
//		}
		
//		int balance=20000;
//		int amount;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter amoumt to deposit");
//		amount=sc.nextInt();
//		
//		if(amount>0) {
//			balance+=amount;
//			System.out.println("current balance :"+balance);
//		}
//		else {
//			System.err.println("enter valid amount");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username:");
		String username=sc.next();
		System.out.println("enter password:");
		String password=sc.next();
		
		if(username.equals("dhanu") && password.equals("1234")) {
			System.out.println("Login successfully");
		}
		else
		{
			System.err.println("login failed enter correct data");
		}
		
	}
	
}
