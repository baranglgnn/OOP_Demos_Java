package bankAccountPackage;

public class BankAccount {
private String ownerName;
private double balance;

public BankAccount(String ownerName,double balance) {
	this.ownerName=ownerName;
	this.balance=balance;
}
public BankAccount() {}

public double deposit(double amount) 
{
  setBalance(getBalance()+amount);	
  return getBalance();
}

public double withDraw(double amount) {
	if(amount>this.balance) 
	{
		return 0;
	}
	setBalance(getBalance()-amount);
	return amount;
}

public double printBalance() {
	return this.balance;
}

public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}


}
