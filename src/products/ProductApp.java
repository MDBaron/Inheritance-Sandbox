package products;

import java.util.Scanner;

public class ProductApp {

	public static void main(String args[]){
	System.out.println("Welcome to the Product Selector");
	System.out.println();
	
	Scanner sc = new Scanner(System.in);
	String choice = "y";
	while(choice.equalsIgnoreCase("y")){
	
	System.out.println("Enter product code: ");
	String productCode = sc.next();
	sc.nextLine();
	Product p = ProductDB.getProduct(productCode);
	
	System.out.println();
	if(p != null){
	System.out.println(p);
	} else {
	System.out.println("No product matches this code!");
	}
	
	System.out.println("Product count: " + Product.getCount() + "\n");
	System.out.println("Continue y/n?: ");
	choice = sc.next();
	sc.nextLine();
	System.out.println();
	
		}//while
	if(choice.equalsIgnoreCase("n")){
		
		System.exit(1);
		
	}//SystemExitCall
	
	}//main
	
}//ClassProductApp
