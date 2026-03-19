package repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;
import model.*;


public class RepositoryIMPL implements Repository {
	// All list that stores data
	
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Shopkeeper> shopkeepers = new ArrayList<>();
	private ArrayList<Product> products = new ArrayList<>();
	
	// methods to get the lists
	public ArrayList<Customer> getCustomerList(){
		return customers;
	}
	
	public ArrayList<Shopkeeper> getShopkeeperList(){
		return shopkeepers;
	}
	
	public ArrayList<Product> getProduct(){
		return products;
	}
	
	
//	HashMap<Shop, Shopkeeper> shops = new HashMap<>();
//  	
//	public HashMap<Shop, Shopkeeper> getShopWithShopkeeper(){
//		return shops;
//	}
}
