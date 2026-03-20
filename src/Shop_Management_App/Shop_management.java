package Shop_Management_App;

import java.util.*;
import service.ServicesIMPL;
import model.*;
public class Shop_management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ServicesIMPL service = new ServicesIMPL(); //creating the object for accessing the method of the service layer
		
		while(true) {
			System.out.println("Enter your choice");
			System.out.println("1. Add Customer \n2. Add Shopkeeper \n3. Add Product \n"
					+ "4. Find Customer by ID \n5. Find Shopkeeper by ID \n6.Find Product by ID \n"
					+ "7. Edit Customer by ID \n8. Edit Shopkeeper by ID \n9. Edit Product by ID \n"
					+ "10. Show Customer by ID \n11. Show Shopkeeper by ID \n12. Show Product by ID \n"
					+ "13. Exit");
					
			int ch = sc.nextInt();
			if (ch == 13) 
				break;
			
			switch(ch) {
			case 1:
				System.out.println("Enter the Customer id, name, contact, mail of Customer");
				int id = sc.nextInt();
				String name = sc.next();
				long contact = sc.nextLong();
				String mail = sc.next();
				
				if(service.addCustomer(id,name, contact, mail)) {
					System.out.println("customer added");
				}
				else
					System.out.println("Cutomer id already present");
				break;
			
			case 2:
				System.out.println("Enter the Shopkeeper id, name of Shopkeeper");
				id = sc.nextInt();
				name = sc.next();
				
				if(service.addShopkeer(id, name)) 
					System.out.println("Shopkeeper added");
				else 
					System.out.println("shopkeeper already present");
				break;
				
			case 3:
				System.out.println("Enter the id, name, price, mrp of product");
				id = sc.nextInt();
				name = sc.next();
				long price = sc.nextLong();
				long mrp = sc.nextLong();
				
				if(service.addProduct(id, name, price, mrp))
					System.out.println("Prduct added successfully");
				else
					System.out.println("product id present use another ID");
				break;
				
			case 4:
				System.out.println("Enter the customer ID");
				Customer cust = service.getCustomer(sc.nextInt());
				if(cust != null) {
					System.out.println("customer found\n"
							+ "id : "+cust.getId() + "name :" + cust.getName());
				}
				else 
					System.out.println("ID not Found");
				break;
				
			case 5:
				System.out.println("Enter the id of shopkeeper");
				id = sc.nextInt();
				Shopkeeper sp = service.getShopkeeper(id);
				if(sp != null)
				{
					System.out.println("Shopkeeper found\n"
							+ "id : "+ sp.getId()+ "name : "+sp.getName());				
				}
				else 
					System.out.println("id not found");
				break;
				
			case 6:
				System.out.println("Enter id of product");
				id = sc.nextInt();
				 Product pr = service.getProduct(id);
				 
				 if(pr != null) {
					 System.out.println("Product found\n"
					 		+ "id : "+ pr.getId()+ "name : "+pr.getName());
				 }
				 else
					 System.out.println("Product ID not found");
				 break;
				 
			case 7:
				System.out.println("Enter the ID of Customer");
				id =sc.nextInt();
				if(service.isACustomer(id)) {
					System.out.println("Enter new name, contact number, mail of customer");
					try { // trying to identify the exception of wrong input
					name = sc.next();
					contact = sc.nextLong();
					mail = sc.next();
					
					Customer customer = service.editCustomer(id, name, contact, mail);
					System.out.println(customer.getId()+" "+customer.getName()+" "+ customer.getContact() + " "+ customer.getMail());
					}
					catch(InputMismatchException ie) { // catching InputMismatchException from the try block
						System.out.println("Please Enter proper data type");
					}
					
				}
				else {
					System.out.println("Customer ID not Found");
				}
				break;
				
			case 8: 
				System.out.println("Enter the id of Shopkeeper");
				id= sc.nextInt(); 
				if(service.isAShopkeeper(id)) {
					System.out.println("Enter the name of shopkeeper");
					name = sc.next();
					Shopkeeper s = service.editShopkeeper(id, name);
					System.out.println("name  updated");
					System.out.println(s.getId()+ " " + s.getName());
				}
				else {
					System.out.println("Id Not Found");
				}
				
				break;
				
			case 9:
				System.out.println("Enter the id of Product");
				id= sc.nextInt(); 
				if(service.isAProduct(id)) {
					System.out.println("Enter the name, price, mrp of product");
					name = sc.next();
					price = sc.nextLong();
					mrp = sc.nextLong();
					Product p = service.editProduct(id, name, price, mrp);
					System.out.println("Product Added");
					System.out.println(p.getId()+ " " + p.getName());
				}
				else {
					System.out.println("Id Not Found");
				}
				break;
				
			case 10:
				break;
				
			case 11:
				break;
				
			case 12:
				break;
				
			}
			
		}
	}

}
