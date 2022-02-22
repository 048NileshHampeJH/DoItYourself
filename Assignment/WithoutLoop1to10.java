//9)Write a Java Program to Print 1 To 10 Without Using Loop.
public class WithoutLoop1to10 {
	public static void main(String[] args) 
	{
		int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 10)
		{
			System.out.println(num +" "); 
			printNumbers(num + 1);
		}	
	}
}