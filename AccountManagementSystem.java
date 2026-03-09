package java_oops;

class AccountManagementSystem {
	private String id;
	private String name;
	private int balance;
	AccountManagementSystem(String id, String name){
		this.id=id;
		this.name=name;
		this.balance=0;
	}
	AccountManagementSystem(String id, String name, int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	public int debit(int amount) {
		if(balance>=amount) {
			balance-=amount;
		}
		else {
			System.out.println("Amount is exceeded from balance amount");
		}
		return balance;
	}
	public int transferTo(AccountManagementSystem another, int amount) {
		if(balance>=amount) {
			balance-=amount;
			another.balance+=amount;
		}
		else {
			System.out.println("Amount is exceeded from balance amount");
		}
		return balance;
	}
	public String toString(){
		return "Account [Id:"+id+" Name: "+name+" Balance: "+balance+"]";
	}
	public static void main(String[] args) {
		
		AccountManagementSystem acc1=new AccountManagementSystem ("aed14","janani",2000);
		AccountManagementSystem another=new AccountManagementSystem ("aed39","reshma",3000);
		
		acc1.credit(200);
		another.debit(1000);
		acc1.transferTo(another,200);
		System.out.println(acc1);
		System.out.println(another);
		
		}

}
