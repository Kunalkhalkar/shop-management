package service;
import model.Product;
import model.Customer;
import model.Shopkeeper;

public interface Services {
	boolean isAShopkeeper(int id);
	boolean isACustomer(int id);
	boolean isAProduct(int id);
	
	Product getProduct(int id);
	Customer getCustomer(int id);
	Shopkeeper getShopkeeper(int id);	
	
	boolean addProduct(int id, String name, long price, long mrp);
	boolean addShopkeer(int id, String name);
	boolean addCustomer(int id, String  name, long contact, String mail);
}
