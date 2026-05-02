package conditional_statements;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		int balance=10000;
		int pin=1212;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin");
		int userpin=sc.nextInt();
		if(userpin==pin) {
			System.out.println("*****Welcome to ATM*****");
			System.out.println("1.deposit");
			System.out.println("2.withdrawal");
			System.out.println("3.balance");
			System.out.println("enter choice");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter amount:");
				int amount=sc.nextInt();
				if(amount>0) {
					balance+=amount;
					System.out.println("Depodited Successfully");
					System.out.println("After Deposited:"+balance);
				}
				else {
					System.err.println("Enter valid amount!!!");
				}
			}
			
			if(ch==2) {
				System.out.println("enter amount:");
				int amount=sc.nextInt();
				if(amount<=balance && amount>0) {
					balance-=amount;
					System.out.println("Withdrawal Successfully");
					System.out.println("After withdrawal:"+balance);
				}
				else if(amount>balance) {
					System.out.println("Insufficient balance");
				}
				else {
					System.err.println("Enter valid amount!!!");
				}
			}
			
			else if(ch==3) {
				System.out.println("Balance:"+balance);
			}

		}
		else {
			System.err.println("Enter Correct Pin");
		}
	}

}
