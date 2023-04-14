
import java.util.Scanner;
class AccountHolder{
	String Name;
	long account_no;
	String UserName;
    String pin;
	int balance;
	public void AccountHolder(String Name,long account_no ) {
		this.Name=Name;
		this.account_no=account_no;
		System.out.println("Account Holder Name: "+Name);
		System.out.println("Account Number: "+account_no);
		
	}
}
class Banktransaction extends  AccountHolder{
	public void BankAccount(String UserName, int balance, String pin) {
        this.UserName = UserName;
        this.balance = balance;
        this.pin = pin;
	}

    public void getBalance() {
       System.out.println("Acccount Balance = "+this.balance);
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
        System.out.println("You Diposit " + amount);
        System.out.println("after Deposit "+amount+" account balance = "+this.balance);
    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.println("You withdrew " + amount);
            System.out.println("After Withdral "+amount+" balance is "+this.balance);
        } else {
            System.out.println("Not enough money. Please Chack Your Balance");
        }
    }
	
} 

class BankAtms extends Banktransaction {
	
	public static void main(String[] args){
		BankAtms ob=new BankAtms();
	     	ob.BankAccount("ramaraju", 1200,"1234");
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter your pin");
	        String pin=s.nextLine();
	        
	        if(pin.equals(ob.pin)) {
	        ob.AccountHolder("Rama Raju",982361234);
	        while(true)
	        {
	        	
	        	System.out.println();
	            System.out.println("Choose 1 for Withdraw");
	            System.out.println("Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance");
	            System.out.println("Choose 4 for EXIT");
	            int n = s.nextInt();
	            switch(n)
	            {
	         case 1:
	               System.out.println("Enter Amount");
	               int withDrawAmt=s.nextInt();
	               ob.withdraw(withDrawAmt);
	               System.out.println("");
	                break;
	 
	         case 2:
	                System.out.println("Enter Amount");
	  	            int depositAmt=s.nextInt();
	                ob.deposit(depositAmt);
	                System.out.println("");
	                break;
	 
	         case 3:
	                ob.getBalance();
	                System.out.println("");
	                break;
	 
	         case 4:
	                System.exit(0);
	            }
	        }
	        }
	        else {
	      System.out.println("Invalid Pin Your Enterd");
	        }
	    }
	}

