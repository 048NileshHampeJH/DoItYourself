//1)Check the given number is EVEN or ODD. 
import java.util.Scanner;

		public class EvenOdd{
	
		public static void main(String[] args){
		
			int num;
			System.out.println("Enter a number:");

			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

 
		if ( num % 2 == 0 )
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		}
	}