package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
	System.out.println("Account");
}
	public void fixed() {
		System.out.println("Amount");
	}
	public void deposite() {
		System.out.println("Rupee");
	}
	public static void main(String[] args) {
		BankInfo s=new BankInfo();
		s.deposite();
		s.saving();
		s.fixed();
	}
}
