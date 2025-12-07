package Payment_System;

public class CryptoPayment extends PaymentMethod{
	 private double balance;
	 private String cardholder_name;
	 
	 public CryptoPayment() {}
	 
	 public CryptoPayment(double balance,String name) {
		 this.balance=balance;
		 this.cardholder_name=name;
	 }

	 @Override
	 public double pay(double amount) {
			balance=balance-amount;
			return amount;
		}
	 @Override
	 public void GetInfo() {
		 System.out.println("Current balance : " + getBalance());
		 System.out.println("Cardholder_name : " + getCardholder_name());
	 }
	 
	 
	public double getBalance() {
		return balance;
	}

	public String getCardholder_name() {
		return cardholder_name;
	}
}
