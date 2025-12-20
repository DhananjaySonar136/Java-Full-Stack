package conditional_statements;

import java.util.Scanner;

public class movie_booking {
	public static void main(String a[]) {
		int ticket;
		double finalprice;
		int quantity;
		Scanner sc=new Scanner(System.in);
		System.out.println("****Enter to The world of Movie Theater*****");
		System.out.println("1. Pushpa");
		System.out.println("2. Kakaan");
		System.out.println("3. Chaava");
		System.out.println("4. Prem ratan dhan payo");
		System.out.println("5. bahubali");
		System.out.println("###############################");
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		
		if(ch==1) {
			ticket=100;
			System.out.println("you have selected Pushpa movie...");
			System.out.println("Ticket price is:"+ticket);
			System.out.println("Enter quantity of ticket:");
			quantity=sc.nextInt();
			
			if(quantity>=5) {
				System.out.println("Discount is 20% :");
				finalprice=quantity*(ticket-(ticket*0.2));
				System.out.println("After cutting discount:"+finalprice);
				
			}
			else if(quantity>=3 && quantity<5) {
				System.out.println("Discount is 10% :");
				finalprice=quantity*(ticket-(ticket*0.1));
				System.out.println("After cutting discount:"+finalprice);
			}
			else {
				System.out.println("No Discount:");
				System.out.println("Total Bill:"+(quantity*ticket));
			}
		}
		
		else if(ch==2) {
			ticket=150;
			System.out.println("you have selected Kaakan movie...");
			System.out.println("Ticket price is:"+ticket);
			System.out.println("Enter quantity of ticket:");
			quantity=sc.nextInt();
			
			if(quantity>=5) {
				System.out.println("Discount is 20% :");
				finalprice=quantity*(ticket-(ticket*0.2));
				System.out.println("After cutting discount:"+finalprice);
				
			}
			else if(quantity>=3 && quantity<5) {
				System.out.println("Discount is 10% :");
				finalprice=quantity*(ticket-(ticket*0.1));
				System.out.println("After cutting discount:"+finalprice);			}
			else {
				System.out.println("No Discount:");
				System.out.println("Total Bill:"+(quantity*ticket));
			}
		}
		
		else if(ch==3) {
			ticket=200;
			System.out.println("you have selected chaava movie...");
			System.out.println("Ticket price is:"+ticket);
			System.out.println("Enter quantity of ticket:");
			quantity=sc.nextInt();
			
			if(quantity>=5) {
				System.out.println("Discount is 20% :");
				finalprice=quantity*(ticket-(ticket*0.2));
				System.out.println("After cutting discount:"+finalprice);
				
			}
			else if(quantity>=3 && quantity<5) {
				System.out.println("Discount is 10% :");
				finalprice=quantity*(ticket-(ticket*0.1));
				System.out.println("After cutting discount:"+finalprice);
			}
			else {
				System.out.println("No Discount:");
				System.out.println("Total Bill:"+(quantity*ticket));
			}
		}
		
		else if(ch==4) {
			ticket=120;
			System.out.println("you have selected Prem ratan dhan payo movie...");
			System.out.println("Ticket price is:"+ticket);
			System.out.println("Enter quantity of ticket:");
			quantity=sc.nextInt();
			
			if(quantity>=5) {
				System.out.println("Discount is 20% :");
				finalprice=quantity*(ticket-(ticket*0.2));
				System.out.println("After cutting discount:"+finalprice);
				
			}
			else if(quantity>=3 && quantity<5) {
				System.out.println("Discount is 10% :");
				finalprice=quantity*(ticket-(ticket*0.1));
				System.out.println("After cutting discount:"+finalprice);
			}
			else {
				System.out.println("No Discount:");
				System.out.println("Total Bill:"+(quantity*ticket));
			}
		}
		else if(ch==5) {
			ticket=200;
			System.out.println("you have selected Bahubali movie...");
			System.out.println("Ticket price is:"+ticket);
			System.out.println("Enter quantity of ticket:");
			quantity=sc.nextInt();
			
			if(quantity>=5) {
				System.out.println("Discount is 20% :");
				finalprice=quantity*(ticket-(ticket*0.2));
				System.out.println("After cutting discount:"+finalprice);
				
			}
			else if(quantity>=3 && quantity<5) {
				finalprice=quantity*(ticket-(ticket*0.1));
				System.out.println("After cutting discount:"+finalprice);
			}
			else {
				System.out.println("No Discount:");
				System.out.println("Total Bill:"+(quantity*ticket));
			}
		}
		
		else {
			System.out.println("You have given invalid choice !!! Enter valid Choice from 1 to 5");
		}
	}
}
