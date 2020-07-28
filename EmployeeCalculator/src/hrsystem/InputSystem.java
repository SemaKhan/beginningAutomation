package hrsystem;

import java.util.Scanner;

public class InputSystem {

	public Customar getinputofproduct() {
		Scanner myscan = new Scanner(System.in);
		Customar details = new Customar();
		
		System.out.println("Please, Enter product name: ");
		 details.ProductName = myscan.nextLine();
		
		System.out.println("Please, Enter product price: ");
		 details.Productprice = myscan.nextDouble();
		
		
		System.out.println("Please, Enter product quantity: ");
		 details.Productquantity = myscan.nextDouble();
		 return  details;
	}

	
}
