package Chapter_6;
// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

	Item item;
	String itemName;
	double itemPrice;
	int quantity;
	ArrayList <Item> cart = new ArrayList<>();
	double total = 0;
	String contents = "Shopping Cart \nName\tPrice\tAmount\n";


 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";

	do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

		// *** create a new item and add it to the cart
		
		item = new Item(itemName, itemPrice, quantity);
		cart.add(item);
		

		// *** print the contents of the cart object using println
		
		contents += (item.toString());
		
		System.out.println(contents);
		
		total += (Item.getQuantity() * Item.getPrice());
		
		System.out.print ("Continue shopping (y/n)? ");
		scan.nextLine();
		keepShopping = scan.nextLine();
	    }
	while (keepShopping.equals("y"));
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	System.out.println("Total Price: " + fmt.format(total));
    }
    
}