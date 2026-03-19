package Shop_Management_App;

import java.util.*;
import service.ServicesIMPL;
public class Shop_management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ServicesIMPL service = new ServicesIMPL(); //creating the object for accessing the method of the servie layer
		while(true) {
			System.out.println("Enter your choice");
			System.out.println("1. Add Customer \n2. Add Shopkeeper \n3. Add Product \n"
					+ "4. Find Customer by ID \n5. Find Shopkeeper by ID \n6.Find Product by ID \n"
					+ "7. Edit Customer by ID \n8. Edit Shopkeeper by ID \n9. Edit Product by ID \n"
					+ "10. Show Customer by ID \n11. Show Shopkeeper by ID \n12. Show Product by ID \n");
			
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Customer id, name, contact, mail of Customer");
				if()
			}
		}
	}

}
