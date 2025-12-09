package bankAccountPackage;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    BankAccount bankAccount= new BankAccount("Baran Gülegen",5000);
		System.out.println("Please select the action you want to perform:");
        System.out.println("1: Check balance");
        System.out.println("2: Deposit money");
        System.out.println("3: Withdraw money");
        int selectedOperation = scan.nextInt();
        if(selectedOperation==1) 
        {
        	System.out.println("Your current balance : "+ bankAccount.getBalance());
        }else if(selectedOperation==2) 
        {
        	System.out.println("Please enter the amount you want to deposit : ");
        	int amountDeposit = scan.nextInt();
        	System.out.println("Your current balance : " +  bankAccount.deposit(amountDeposit));
        }else 
        {
        	System.out.println("Please enter the amount you want to withdraw : ");
        	int amountWithdraw = scan.nextInt();
        	System.out.println("Withdrawn amount : " + bankAccount.withDraw(amountWithdraw));
        	System.out.println("Your current balance : " + bankAccount.getBalance());
        	
        }

	}

}
