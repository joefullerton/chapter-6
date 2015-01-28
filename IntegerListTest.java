package Chapter_6;

// ****************************************************************
//import IntegerList;

// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************
import java.util.Scanner;

public class IntegerListTest
{
  static IntegerList list = new IntegerList(10);
  static Scanner     scan = new Scanner(System.in);

  // -------------------------------------------------------
  // Create a list, then repeatedly print the menu and do what the
  // user asks until they quit
  // -------------------------------------------------------
  public static void main(String[] args)
  {
    printMenu();
    int choice = scan.nextInt();
    while (choice != 0)
    {
      dispatch(choice);
      printMenu();
      choice = scan.nextInt();
    }
  }

  // --------------------------------------
  // Do what the menu item calls for
  // --------------------------------------
  public static void dispatch(int choice)
  {
    int loc;
    switch (choice)
    {
    case 0:
      System.out.println("Bye!");
      break;
    case 1:
      System.out.println("How big should the list be?");
      int size = scan.nextInt();
      list = new IntegerList(size);
      list.randomize();
      break;
    case 2:
      list.print();
      break;
    default:
      System.out.println("Sorry, invalid choice");
    case 3:
      int oldVal = 0;
      int newVal = 0;
      System.out.println("Please enter what we're searching for:");
      oldVal = scan.nextInt();
      System.out.println("Enter what you want to replace it wtih");
      newVal = scan.nextInt();
      list.replaceFirst(oldVal, newVal);
      break;
    case 4:
      System.out.println("Please enter what we're searching for:");
      oldVal = scan.nextInt();
      System.out.println("Enter what you want to replace it wtih");
      newVal = scan.nextInt();
      list.replaceAll(oldVal, newVal);
      break;
    case 5:
      list.sortDecreasing();
      break;
    case 6:
      int target;
      System.out.println("What number are you searhing for?");
      target = scan.nextInt();
      list.binarySearchD(target);
      System.out.println(list.binarySearchD(target));
      break;
    }
  }

  // ----------------------------
  // Print the user's choices
  // ----------------------------
  public static void printMenu()
  {
    System.out.println("\n   Menu   ");
    System.out.println("   ====");
    System.out.println("0: Quit");
    System.out.println("1: Create a new list (** do this first!! **)");
    System.out.println("2: Print the list");
    System.out.println("3: Replace First");
    System.out.println("4: Replace All");
    System.out.println("5: Reverse Order");
    System.out.println("6: Binary search");
    System.out.print("\nEnter your choice: ");
  }

}