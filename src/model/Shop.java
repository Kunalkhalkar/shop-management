package model;

public class Shop {
	private int id;
	private String name;
	
	public Shop(int sid, String sname, int skid, String skname) {
		//create a object of shop and then store it in map here
		//a shop has single owner 
		// owner can have many shop
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
	
	
}
