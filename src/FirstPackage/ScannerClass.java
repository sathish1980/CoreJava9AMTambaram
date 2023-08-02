package FirstPackage;

import java.util.Scanner;

public class ScannerClass {
	
	
	public void scannerImplementation()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Please enter the first number :");
		int value1 = sc.nextInt();
		System.out.println( "Please enter the second number :");
		int value2 = sc.nextInt();
		
		int c =value1+value2;
		/*
		 * nextBoolean()	Reads a boolean value from the user
			nextByte()	Reads a byte value from the user
			nextDouble()	Reads a double value from the user
			nextFloat()	Reads a float value from the user
			nextInt()	Reads a int value from the user
			nextLine()	Reads a String value from the user
			nextLong()	Reads a long value from the user
			nextShort()	Reads a short value from the user
		 */
		System.out.println("Sum of 2 value is: " +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerClass s = new ScannerClass();
		s.scannerImplementation();
	}

}
