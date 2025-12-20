package looping_statements;

public class nested_for_loop {

	public static void main(String[] args) {
		
//		* * * 
//		* * * 
//		* * * 
		
//		for(int i=1;i<=3;i++) { //rows
//			for(int j=1;j<=3;j++) { //columns
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
	//*************************************
		
//		* * # * * 
//		* * # * * 
//		# # # # # 
//		* * # * * 
//		* * # * *
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==3) {
//					System.out.print("# ");
//				}
//				
//				else if(i==3) {
//				System.out.print("# ");
//				}
//	
//				else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
	//************************************	
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=5;j++) {
//			
//					System.out.print("* ");
//				}
//			System.out.println();
//		}
		
	//**********************************
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * * 
//		* * * * * * * 
//		* * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * * 
//		for(int i=10;i>=1;i--) {
//			for(int j=i;j<=10;j++) {
//				
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		//*******************************************
		
//		$ * # * $ 
//		$ * # * $ 
//		$ * # * $ 
//		$ * # * $ 
//		$ * # * $ 
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==3) {
//					System.out.print("# ");
//				}
//				
//				else if(j==1 || j==5) {
//				System.out.print("$ ");
//				}
//	
//				else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
		//*****************************************
		
//		A A A A A 
//		1 2 3 4 5 
//		5 5 5 5 5 
//		1 2 3 4 5 
//		X X X X X 
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i==1) {
//					System.out.print("A ");
//				}
//				else if(i==3) {
//					System.out.print("5 ");
//				}
//				else if(i==5){
//					System.out.print("X ");
//				}else {
//					System.out.print(j+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//**********************************************
		
//		a a a a a 
//		b b b b b 
//		c c c c c 
//		d d d d d 
//		e e e e e 
		
//		for(int i='a',k=1;i<='e';i++,k++) {
//			for(int j='a';j<='e';j++) {
//			System.out.print((char)j+" ");
//			}
//			System.out.println();
//		}
		
//****************************************
		
//		a a a a a 
//		b b b b b 
//		c c c c c 
//		d d d d d 
//		e e e e e 
		
//		for(int i='a',k=1;k<=5;i++,k++) {
//			for(int j=1;j<=5;j++) {
//			System.out.print((char)i+" ");
//			}
//			System.out.println();
//		}
		
	//***************************************************
	
//		a b c d e 
//		a b c d e 
//		a b c d e 
//		a b c d e 
//		a b c d e
		
//		for(int i='a',k=1;i<='e';i++,k++) {
//			for(int j='a';j<='e';j++) {
//				System.out.print((char)j+" ");
//			}
//			System.out.println();
//		}
		
		
//*************************************************
//		a b c d e 
//		a b c d e 
//		2 2 2 2 2 
//		a b c d e 
//		a b c d e 
//		
//		for(int i='a',k=1;i<='e';i++,k++) {
//			for(int j='a';j<='e';j++) {
//				if(i=='c') {
//					System.out.print("2 ");
//				}
//				else
//				System.out.print((char)j+" ");
//			}
//			System.out.println();
//		}
		
		
//***************************************************
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 
		
//		for(int i=1;i<=5;i++) {
//			for(int k=1;k<=i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//****************************************************		
		
//		 *****
//		  ***
//		   *
//		int stars=5;
//		for(int i=1;i<=3;i++) {
//			for(int k=1;k<=i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=stars;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			stars-=2;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
