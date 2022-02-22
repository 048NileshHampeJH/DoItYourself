//3)Find the Factorial of a number using Recursion
import java.util.Scanner;

	public class FactorialRecursion{  
		static int factorial(int n){    
		if (n == 0)    
		return 1;    
		else    
			return(n * factorial(n-1));    
		}    
	public static void main(String args[]){  
		int i,fact=1;  
		int number; 
		System.out.println("Enter the number:"); 

		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		fact = factorial(number);   
		System.out.println("Factorial of "+number+" is: "+fact);    
	}  
	}  
