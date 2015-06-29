package testCase1;

public class BankAccount {

	int balance;
	
	BankAccount (){
		
		balance = 100;
	}
	int depositCash(int amt){
		
		balance = balance + amt ;
		return balance;
	}
	
	int withdrawCash(int amt){
		
		balance = balance - amt ;
		return balance;

		
	}
	
	
	 int getBalance(){
		 
		 return balance;
	 }
}
