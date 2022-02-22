//13)Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 

import java.util.Scanner;
class SmallestNumber {
 
    static int smallest(int x, int y, int z)
    {
        int c = 0;
 
        while (x != 0 && y != 0 && z != 0) {
            x--;
            y--;
            z--;
            c++;
        }
 
        return c;
    }
 
    public static void main(String[] args)
    {
       
		System.out.println("Enter the numbers: ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
 
        System.out.printf("Smallest of 3"+ " numbers is %d",smallest(x, y, z));
                                                       
    }
}