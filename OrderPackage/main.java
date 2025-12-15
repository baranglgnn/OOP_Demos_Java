package OrderPackage;

import java.util.Scanner;

import ProductPackage.Product;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter product name : ");
        String product_name= scan.nextLine();
        System.out.println("Please enter product price : ");
        int price= scan.nextInt();
        Product product = new Product(product_name,price);
        OrderService order = new OrderService(product);
        order.kdvAdder();
	}

}
