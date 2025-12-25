package ProductPackage; 

public class Product { 
	private String product_name; 
	private double price;
	public Product() {}
	public Product(String name,double price)
	{
		this.product_name = name; this.price = price; 
	}
	public String getProduct_name()
	{
		return product_name; 
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
		} 
	public double getPrice() { 
		return price; 
		} 
	public void setPrice(double price) {
		this.price = price; 
		}
	}
