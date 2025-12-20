package looping_statements;

import java.util.Scanner;

public class nested_while {

	public static void main(String[] args) {
		
//		int i=1;
//		while(i<=5) {
//			
//			int j=1;
//			while(j<=5) {
//				System.out.println("Prem");
//				j++;
//			}
//			System.out.println("Gaurav");
//			i++;
//		}

//*****************************************************		
		
//		int i=1;
//		while(i<=10) {
//			
//			int j=2;
//			while(j<=30) {
//				System.out.print(i*j+"\t");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//******************************************************
		
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		
//*****************************************************
	//print 1 -- 10	
//		int i=1;
//		boolean cond=false;
//		while(!cond) {
//			if(i==10) {
//				cond=true;
//			}
//			System.out.println(i);
//			i++;
//		}
		
//******************************************************
		
		int userpin;
		int balance=1000;
		int amount;
		int pin=1212;
		int attempts=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to ATM");
		boolean decision=true;
		while(decision) {
			System.out.println("Enter atm pin");
			userpin=sc.nextInt();
			int ch=0;
			if(userpin==pin) {
				
				while(ch>=0){
					String cc="Y";
					System.out.println("Do you want to continue ?(Y/N)");
					String c=sc.next();
					if(cc.equals(c)) {
						System.out.println("1.Deposit");
						System.out.println("2.withdrawl");
						System.out.println("3.Balance");
						System.out.println("4.Exit");
						System.out.println("Enter choice :");
						ch=sc.nextInt();
						
						if(ch==1) {
							
							System.out.println("Enter amount:");
							amount=sc.nextInt();
							if(amount<0) {
								System.out.println("Enter valid amount:");
								amount=sc.nextInt();
							}
							else {
								balance+=amount;
								System.out.println("Deposited successfully:");
							}
						}
						
						else if(ch==2) {
							System.out.println("Enter amount to withdrawl:");
							amount=sc.nextInt();
							if(amount>balance) {
								System.out.println("Insufficient balance");
							}
							else if(amount<0) {
								System.out.println("Enter valid amount ");
							}
							else {
								balance-=amount;
							}
						}
						else if(ch==3){
							System.out.println("Balance ="+balance);
						}
						else if(ch==4){
							System.out.println("Thanks for visiting.....");
							decision=false;
							break;
						}
						else {
							System.out.println("Invalid Choice!!!");
							decision=false;
							break;
						}
					}
					else {
						System.out.println("Thanks For visiting.....");
						decision=false;
						break;
					}			
				}
			}
			
			
			else {
				attempts++;
				if(attempts==3) {
					System.out.println("Your account has been blocked");
					break;
				}
				System.out.println("Enter correct pin!!!!");
				System.out.println("Attempts Left -> "+(3-attempts));
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
