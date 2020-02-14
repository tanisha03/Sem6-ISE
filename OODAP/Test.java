import java.util.*;
class Bank{
	int balance;
	Bank(){
		this.balance =5000;
	}
	void deposit(int dep){
		this.balance += dep;
	}
	void withdraw(int wit){
		this.balance -= wit;
	}
	int getBalance(){
		return this.balance;
	}
}
class Customer extends Bank{
	String name,phone;
	int age;
	Customer(String name,String phone,int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	String getCustomerDetails(){
		return "Name:"+this.name+" Age:"+this.age+" phone:"+this.phone;
	}	
}
class Loan extends Bank{
	Loan(){
		
	}
	int loanAmt;
	void setLoanAmt(int loanAmt){
		this.loanAmt = loanAmt;
	}
	
	String eligible(){
		
		if(age<60){
			if(loanAmt>50000){
				System.out.println("Loan grabnted");
			}
		}
		else{
			System.out.println("You are broke Sorry");
		}
	}
}
class Atm extends Bank{
	String pin;
	Atm(String pin){
		super();
		this.pin = pin;
	}
	Boolean match(String a){
		if(a.equals(this.pin)){
			return true;
		}
		return false;
	}
}

public class Test{
	public static void main(String[] args) {
		// Bank b = new Bank();
		Customer c = new Customer("Jack","95353",23);
		System.out.println(" "+c.getCustomerDetails());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		int dep = sc.nextInt();
		c.deposit(dep);
		int bal = c.getBalance();
		System.out.println("Balance is "+bal);
		System.out.println("Enter amount to withdraw");
		int wit = sc.nextInt();
		c.withdraw(wit);
		System.out.println("Balance is "+c.getBalance());
		System.out.println("Enter pin");
		String pin = sc.next();
		Atm at = new Atm(pin);

	}
}