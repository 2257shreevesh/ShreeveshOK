package Package;

public class Mobile {
	private String name;
	private Integer price;
	
	public Mobile() {
		super();
		this.name="";
		this.price=0;
	}
	public Mobile(String name,Integer price) {
		setName(name);
		setPrice(price);
	}
	
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
