package Chapter_6;
// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
    Scanner scan = new Scanner(new File("H:\\AP Computer Science\\APCS_Files\\Chapter_6\\magicData.txt"));

	int count = 1;                 //count which square we're on
	int size = scan.nextInt(); 
	int col = 0;
	int row = 0;
	//size of next square
	//Expecting -1 at bottom of input file

	while (size != -1)
	    {

		//create a new Square of the given size
		Square sqsize = new Square(size);

		//call its read method to read the values of the square
		sqsize.readSquare(scan);

		System.out.println("\n******** Square " + count + " ********");
		//print the square
		sqsize.printSquare();

		//print the sums of its rows
		//for(int row = 0; row < size; row++)
		//{
		  System.out.println("Sum of Rows: " + sqsize.sumRow(row));
		//}

		//print the sums of its columns
    //for(int col = 0; col < size; col++)
   // {
      System.out.println("Sum of Columns:" + sqsize.sumCol(col));
   // }
		

		//print the sum of the main diagonal
		System.out.println("Sum of Main Diagonal: " + sqsize.sumMainDiag());

		//print the sum of the other diagonal
		System.out.println("Sum of Other Diagonal: " +sqsize.sumOtherDiag());

		//determine and print whether it is a magic square
		if(sqsize.magic())
		  System.out.println("Is Magic!");
		else
		  System.out.println("Is not Magic!");
		
		//get size of next square
		size = scan.nextInt();
		
		count++;
	    }

   }
}