package Chapter_6;

// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************

import java.util.Scanner;

public class Square
{
  int[][] square;

  // --------------------------------------
  // create new square of given size
  // --------------------------------------
  public Square(int size)
  {
    square = new int[size][size];
  }

  // --------------------------------------
  // return the sum of the values in the given row
  // --------------------------------------
  public int sumRow(int row)
  {
    int sum = 0;
    for (int col = 0; col < square.length; col++)
    {
      sum += square[row][col];
    }

    return sum;
  }

  // --------------------------------------
  // return the sum of the values in the given column
  // --------------------------------------
  public int sumCol(int col)
  {

    int sum = 0;
    for (int row = 0; row < square.length; row++)
    {
      sum += square[row][col];
    }

    return sum;
  }

  // --------------------------------------
  // return the sum of the values in the main diagonal
  // --------------------------------------
  public int sumMainDiag()
  {
    int sum = 0;
    for (int i = 0; i < square.length; i++)
    {
      sum += square[i][i];
    }
    return sum;
  }

  // --------------------------------------
  // return the sum of the values in the other ("reverse") diagonal
  // --------------------------------------
  public int sumOtherDiag()
  {
    int sum = 0;
    int lastIndex = square.length - 1;
    for (int i = 0; i < square.length; i++)
    {
      sum += square[i][lastIndex - i];
    }
    return sum;
  }

  // --------------------------------------
  // return true if the square is magic (all rows, cols, and diags have
  // same sum), false otherwise
  // --------------------------------------
  public boolean magic()
  {
    int chkSum = sumMainDiag();
    boolean isMagic = sumOtherDiag() == chkSum;

    int row = 0;
    while (row < square.length && isMagic)
    {
      if (sumRow(row) != chkSum)
        isMagic = false;
      else
        row++;
    }

    int col = 0;
    while (col < square.length && isMagic)
    {
      if (sumCol(col) != chkSum)
        isMagic = false;
      else
        col++;
    }
    return isMagic;
  }

  // --------------------------------------
  // read info into the square from the input stream associated with the
  // Scanner parameter
  // --------------------------------------
  public void readSquare(Scanner scan)
  {
    for (int row = 0; row < square.length; row++)
      for (int col = 0; col < square.length; col++)
        square[row][col] = scan.nextInt();
  }

  // --------------------------------------
  // print the contents of the square, neatly formatted
  // --------------------------------------
  public void printSquare()
  {
    for (int row = 0; row < square.length; row++)
    {
      for (int col = 0; col < square.length; col++)
      {
        System.out.print(square[row][col] + "\t");
      }
      System.out.println();
    }
  }
}