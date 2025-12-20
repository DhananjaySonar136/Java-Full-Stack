package looping_statements;

public class for_loop {

	public static void main(String[] args) {
		
//		for(int i=1;i<=10;i++) {
//			System.out.println("prem");
//		}
		
		//Infinite loop
//		for(;;) {
//			System.out.println("prem");
//		}
		
//		for(int i=1;;) {
//			System.out.println("prem");
//		}
		
//		for(int i=1;;i++) {
//			System.out.println("prem");
//		}
		
//		for(int i=1;i<=10;) {
//			System.out.println("prem");
//		}
		
		
//		int i=1;
//		for(;i<=10;) {
//			System.out.println("prem");
//			i++;
//		}
		//************************************
		
//		for(int i=1,j=1;i<=10;i++,j++) {
//			System.out.println("prem "+i+"  "+j);
//		}
//		
//		
//		for(int i=1,j=1;i<=10 && i==2;i++,j++) {
//			System.out.println("prem "+i+"  "+j);//nothing will get print
//		}
		
		
		
		for(int i=1,j=1;i<=10 && j<=10;i++,j++) {
			System.out.println("prem "+i+"  "+j);//prem 1  1
												 //prem 2  2
		}

	}

}
