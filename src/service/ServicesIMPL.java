package service;
import java.util.*;
import model.Customer;
import model.Product;
import model.Shopkeeper;
import repository.*;

public class ServicesIMPL implements Services {

	// create object of repository to access methods of repository
	RepositoryIMPL rp = new RepositoryIMPL(); 
	
	ArrayList<Shopkeeper> al = rp.getShopkeeperList();//fetching the shopkeeper list from repository to service
	
	ArrayList<Customer> cl = rp.getCustomerList(); // fetching the customer list
	
	ArrayList<Product> pd = rp.getProduct(); // fetching the Product list
	
	
	public boolean addProduct(int id, String name, long price, long mrp) {// return true if added successfully
		return true;
	}
	
	public boolean addShopkeer(int id, String name) {
		return false;
	}
	
	public boolean addCustomer(int id, String  name, long contact, String mail) {
		return false;
	}
	
	@Override
	public boolean isAShopkeeper(int id) {// to check Shopkeeper is available
		boolean result = getShopkeeper(id) == null ? false : true;
		return result;
	}

	@Override
	public boolean isACustomer(int id) {// to check customer is available
		boolean result = getCustomer(id) == null ? false : true;
		return result;
	}

	@Override
	public boolean isAProduct(int id) { // to check product is available
		boolean result = getProduct(id) == null ? false : true;
		return result;
	}

	@Override
	public Product getProduct(int id) { // method to get product details
		Product pod = null;
		for(Product p : pd) {
			if(p.getId() == id) 
				pod = p;
		}
		return pod;
	}

	@Override
	public Customer getCustomer(int id) { //method to get customer from id
		Customer ct = null;
		for(Customer c : cl) {
			if(c.getId() == id) {
				ct = c;
			}
		}
		return ct;
	}

	@Override
	public Shopkeeper getShopkeeper(int id) { // to get shopkeeper object from id
		Shopkeeper sp = null;
		for(Shopkeeper s : al) {
			if(s.getId() == id) {
				sp = s; // if array list contains the id then sp stores the value;
				break;
			}			
		}
		return sp; //returning the value if sp even if it is null
	}
	

}
