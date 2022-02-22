//19)Check whether the Given Number is a Palindrome or NOT.

import java.util.Scanner;
	class PalindromeNumber {
		public static void main(String[] args) {
    
			int num , reversedNum = 0, remainder;
    
			System.out.println("Enter the number");
			
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			int originalNum = num;
    
		
			while (num != 0) {
				remainder = num % 10;
				reversedNum = reversedNum * 10 + remainder;
				num /= 10;
			}
    
				
			if (originalNum == reversedNum) {
				System.out.println(originalNum + " is Palindrome.");
			}
			else {
				System.out.println(originalNum + " is not Palindrome.");
			}
		}		
	}