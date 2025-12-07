package Payment_System;

public class PaymentMain {

	public static void main(String[] args) {
		PaymentMethod credit = new CreditCardPayment(5000,"Baran Gülegen");
        Product phone = new Product("Samsung a3",4000);
        System.out.println("Purchased product : " + phone.getProduct_name());
        System.out.println("Purchased product : " + credit.pay(phone.getProduct_cost()));
        credit.GetInfo();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        PaymentMethod crypto = new CryptoPayment(6000,"Celal Korucu");
        Product fridge = new Product("Beko A400",5500);
        System.out.println("Purchased product : " + fridge.getProduct_name());
        System.out.println("Purchased product : " + crypto.pay(fridge.getProduct_cost()));
        crypto.GetInfo();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        PaymentMethod paypal = new PaypalPayment(2500,"Numan Göktürk");
        Product Floor_lamb = new Product("Ikea lamb",500);
        System.out.println("Purchased product : " + Floor_lamb.getProduct_name());
        System.out.println("Purchased product : " + paypal.pay(Floor_lamb.getProduct_cost()));
        paypal.GetInfo();
	}

}
