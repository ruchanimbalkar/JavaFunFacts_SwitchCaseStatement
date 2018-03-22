package brand;

/***
 * **
 * @author Rucha Nimbalkar
 * Description: The following program demonstrates what value types can be used in Switch case statement
 */

public class Switchcase {

	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4};
		int d= 5; //Yes
		char a ='p'; //Yes
		double d2 = 1.5; //No
		float f = 1.6f; //No
		byte m = 2; //Yes
		short num1= 5; //Yes
		long num2=1000;  //No
		boolean bool= true; //No
		String[] str={"January", "February", "March", "April", "May", "June", "July",
				       "August", "September", "October", "November", "December"};
		//Strings can be case values
		
		switch(d)  //We can also do switch(5)
		{
				case 1:   //I tried arr[0], it gives error"Case expressions must be constant" 
						    if (d==arr[0])
						    System.out.println("Match at arr[0]");	
					        break;
					        
					        
				case 2:
					        if (d==arr[1])
					        System.out.println("Match at arr[1]");	
				            break;
				            
				case 3:
							if (d==arr[2])
							System.out.println("Match at arr[2]");	
							break;
							
				case 4:
					        if (d==arr[3])
							System.out.println("Match at arr[3]");	
						    break;
						    
			    default:
			    	     System.out.println("Match not found");
			    	      
				             
				             
		}
		
		//char value
		switch(a)
		{
			case 'p':
					System.out.println(" char" + a + " chars can be case values for switch case");
					break;
		}
		
		switch(m)
		{
			case 2:
				    System.out.println("byte" + m + "bytes can be case values for switch case");
		}
		
		switch(num1)
		{
			case 5:
				    System.out.println("short" + num1 + "short can be case values for switch case");
		}
		
		
//		Cannot switch on a value of type long. 
		//Only convertible int values, strings or enum variables are permitted
//		switch(num2)
//		{
//			case 2:
//				    System.out.println("byte" + m + "bytes can be case values for switch case");
//		}
		
		System.out.println("Strings can be case values for switch case");
		for(int i=0;i<str.length;i++)
		{
			switch(str[i])
			{
				case "January":
					            System.out.println(str[i] + ": First monnth");
					            break;
					            
				case "February" :
		            			System.out.println(str[i] + ": Second monnth");
		                        break;
		                        
				case "March" :
		            			System.out.println(str[i] + ": Third monnth");
		            			break;
		            			
				case "April" :
					            System.out.println(str[i] + ": Fourth monnth");
					            break;
					            
				case "May" :
		            			System.out.println(str[i] + ": Fifth monnth");
		            			break;
		            			
				case "June" :
		            			System.out.println(str[i] + ": Sixth monnth");
		            			break;
		            			
				case "July" :
		            			System.out.println(str[i] + ": Seventh monnth");
		            			break;
		            			
				case "August" :
		            			System.out.println(str[i] + ": Eight monnth");
		            			break;
		            			
				case "September" :
		            			System.out.println(str[i] + ": Ninth monnth");
		            			break;
		            			
				case "October" :
		            			System.out.println(str[i] + ": Tenth monnth");
		            			break;
		            
				case "November" :
		            			System.out.println(str[i] + ": Eleventh monnth");
		            			break;
		            			
				case "December" :
        						System.out.println(str[i] + ": Last monnth");
        						break;
		            
			}
		}
		
//		switch(bool) //Cannot switch on a value of type boolean
//		{
//			
//		}
		
		String icecream = "Ice cream";
		switch(icecream) //Switch(string) 
		{
			case "Ice cream":
				              System.out.println("We can so switch('stringvalue')");
							  break;
		}
		
		switch("icecream") //Switch( string literal)
		{
			case "Ice cream":
				              System.out.println("We can so switch('stringvalue')");
							  break;
		}
		
		//We can have a switch case with just a default statement.
		switch(2)
		{
			default:
				    System.out.println("Switch case with just a default statement");
		}
	
	}
}
