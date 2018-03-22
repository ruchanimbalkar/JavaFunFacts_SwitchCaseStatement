package brand;
import java.util.Scanner;


public class Operation {
	
	public static void main(String[] args){
	
		int a,b;
		byte operation;
		String ans;
		Scanner stdin= new Scanner(System.in);
		do{
			System.out.println(" Please enter two numbers a and b: ");
			a=stdin.nextInt();
			b=stdin.nextInt();
			System.out.println(" Enter 1 to add "+ a + " and " + b);
			System.out.println(" Enter 2 to subtract " + b +" from " + a);
			operation = stdin.nextByte();
		 
		 
			switch(operation){
			
				case 1:
		 			 		System.out.println(a +" + " + b +" = " + (a+b));
		 			 		break;
		 			 		
		 			 		
				case 2:
		 			 		System.out.println(a +" - " + b +" = " + (a-b));
		 			 		break;			
			}
			
			System.out.println("Press N or n or 0 to exit");
			 ans = stdin.next();
		}while(ans=="n"||ans=="N"||ans=="0");
		 stdin.close();
	}
}
