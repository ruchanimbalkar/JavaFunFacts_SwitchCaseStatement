package brand;
/**
 * 
 *  * @author Rucha Nimbalkar
 *   Description: Can char be initialized? If so how? How do we know char is empty?
 *   We know 
 */
public class InitializingChar {

	public static void main(String[] args)
	{
		
		char a=' '; // We initialized it to blank space
		char ch='\u0000';//default value 
		System.out.println("Default value of char data type.");
		System.out.println("a :" +a);
		System.out.println("ch :"+ch);
	}
}
