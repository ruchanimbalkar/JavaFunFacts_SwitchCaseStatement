package brand;

public class SwitchReturn {

	public static int BasicOperations(char ch, int a, int b)
	{
		switch(ch){
			case '+':
					return (a+b);
					
			case '-':
				    return (a-b);
				    
			case '/':
			    	return (a/b);
			    
			case '*':
			    	return (a*b);
			    	
			    	
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("50 + 60 = :" + BasicOperations('+',50,60));
		System.out.println("100 - 20 = :" + BasicOperations('-',100,20));
		System.out.println("100 / 10 = :" + BasicOperations('/',100,10));
		System.out.println("12 * 15 = :" + BasicOperations('*',12,15));
		
		
	}

}
