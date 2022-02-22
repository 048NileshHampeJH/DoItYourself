//6)Swap two numbers without using third variable approach 3
import java.io.*;
import java.util.Scanner;
 
	public class Swap3{
	
    public static void main(String[] args)
    {
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
         
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y); 
 
        
        x = x * y; 
        y = x / y; 
        x = x / y; 
 
        System.out.println("After swaping:" + " x = " + x + ", y = " + y);
                           
    }
}