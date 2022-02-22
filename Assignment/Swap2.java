//Swap two numbers without using third variable approach 2 
//Java code to swap using XOR

import java.io.*;
import java.util.Scanner;
 
	public class Swap2 {
 
    public static void main(String a[])
    {
       System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
         
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y); 
       
        x = x ^ y; 
        y = x ^ y; 
        x = x ^ y; 
        System.out.println("After swap: x = " + x + ", y = " + y);
                           
    }
}