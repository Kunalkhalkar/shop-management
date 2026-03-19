package model;

public class Product {

	private int id;
	private String name;
	private long price;
	private long MRP;
	
	public Product(int id, String name, long price, long MRP){
		this.id = id;
		this.name = name;
		this.MRP = MRP;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getMRP() {
		return MRP;
	}
	public void setMRP(long mRP) {
		MRP = mRP;
	}
	
	
}
