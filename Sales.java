package Chapter_6;
// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
	
	int sum;
	int value;
	Scanner scan = new Scanner(System.in);

	
	System.out.println("Enter Number of Sales People!");
	int SALESPEOPLE = scan.nextInt();
	int[] sales = new int[SALESPEOPLE];

	for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
		
		sales[i] = scan.nextInt();

	    }

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;
	int large = sales[0];
	int small = sales[0];
	int highseller = 0;
	int lowseller = 0;
	int current = 0;
	for (int i=0; i<sales.length; i++)
	    {
		System.out.println("     " + (i + 1) + "         " + sales[i]);
		sum += sales[i];
		
		if (sales[i] > large)
		{
				large = sales[i];
				highseller = i;
		}
		if (sales[i] < small)
		{
			current = sales[i];
					if (sales[i] < current)
					{
						small = sales[i];
						lowseller = i;
					}
		else
		{
			small = current;
			lowseller = i;
		}
	    }
	    }
	
	double avg = (sum / SALESPEOPLE);

	System.out.println("\nTotal sales: " + sum + ""
			+ "\nAverage Sales: " + avg + ""
					+ "\nSalesperson " + highseller + " Had the Highest Sale with " + large + "\nSalesperson "
							+ lowseller + " Had the Lowest Sale with " + small);
	System.out.println("Enter a Value!");
	value = scan.nextInt();
	for(int i=0; i<sales.length; i++)
	{
		if(value <= sales[i])
			System.out.println("Salesperson " + (i + 1) + " Sales: " + sales[i]);
	}
	
		
    }
}