package OrderPackage;

import ProductPackage.Product;

public class OrderService {
   private Product product;
   
   public OrderService() {}
   
   public OrderService(Product product) {
	   this.product= product;
   }
	
	public void kdvAdder() {
		this.product.setPrice((this.product.getPrice()*0.18)+this.product.getPrice());
		System.out.println("KDV price : " + this.product.getPrice());
	}
}
