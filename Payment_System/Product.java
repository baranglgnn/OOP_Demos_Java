package Payment_System;

public class Product {
    private String product_name;
    private double product_cost;
    
	public Product() {}
	
	public Product(String name,int cost) {
		this.product_name=name;
		this.product_cost=cost;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(int product_cost) {
		this.product_cost = product_cost;
	}
}
