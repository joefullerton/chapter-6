package Chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray
{
	public static void main(String []args )
	{
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter a Value: ");
		value = scan.nextInt();
		
		int[] values = new int[value];
		
		System.out.println("Enter " + value + " Numbers");
		for(int i = 0; i < value; i++)
		{
			values[i] = scan.nextInt();
		}
		
		System.out.println("Enter " + value + " Numbers");
		for(int i = 0; i < value; i++)
		{
			System.out.print(values[i] + " ") ;
		}
		
		System.out.println();
		for (int i = values.length - 1; i >= 0; i--)
		{
			System.out.print(values[i] + " ") ;
		}
	}
}
