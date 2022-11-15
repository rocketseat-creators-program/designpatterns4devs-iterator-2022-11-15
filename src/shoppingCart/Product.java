package shoppingCart;

public class Product {
   
    private String desc;
	private Double value;

	public Product(String desc, Double value) {
		this.desc = desc;
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}
	
	public Double getValue() {
		return value;
	}
    
}
