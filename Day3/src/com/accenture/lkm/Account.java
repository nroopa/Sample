package com.accenture.lkm;

public class Account {

	protected int min_balance;
	private String accountType;
	 String IFSCCode;
	private String BankName;
	public Account() {
	System.out.println("------I am in default constructors ------ ");
	min_balance=5000;
	accountType="Saving";
	IFSCCode="IFSC0011";
	BankName="Axis";
	System.out.println("Account Info from constructor ");
	System.out.println(min_balance+ " " +accountType+ " " +IFSCCode+ " "+BankName);
			
	}
	
	public void AccountInfo() {
		System.out.println("Account information is: ");
		System.out.println(min_balance+ " " +accountType+ " " +IFSCCode+ " "+BankName);
	}
	public static void main(String[] args) {
Account account=new Account();
//account.AccountInfo();

		
	}

}
