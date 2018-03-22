package brand;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		num1=100;
		num2=865;
		
		System.out.println("Value of num1 is " + num1 + "and value of num2 is "+ num2);
		//To swap two values:
		/*Note that I have not followed camelcasing while declaring num1 */
		int prevnum1=num1; // copy value of num1 in prevnum1
		num1=num2;     //copy value of num2 in num1
		num2=prevnum1;     //copy temp (previous value of num1) in num2
		System.out.println("After Swapping : ");
		System.out.println("Value of num1 is " + num1 + "and value of num2 is "+ num2);
	}

}
