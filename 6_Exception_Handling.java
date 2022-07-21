import java.util.Locale; 
import java.util.Scanner; 
class DemonetizationException extends Exception{ 
 float amount; 
 DemonetizationException(float amount){ 
 this.amount = amount; 
 } 
 public String toString(){ 
 return("Deposit of Old currency of (Rs " +amount+ ") crosses Rs.5,000 so can't be deposited"); 
 } 
} 
class Account{ 
 float balance; 
 Account(){ 
 balance = 500; 
 } 
 void deposit(float amount, String currencyType){ 
 String currency = currencyType.toUpperCase(); 
 try{ 
 if(currency.equals("OLD") && amount>5000){ 
 throw new DemonetizationException(amount); 
 } 
 balance += amount; 
 } 
 catch (DemonetizationException e){ 
 System.out.println(e); 
 } 
 } 
 void withdraw(float amount){ 
 if(amount>balance){ 
 System.out.println("Not enough balance... cannot withdraw"); 
 } 
 else if((amount-balance)<500){ 
 System.out.println("Cannot maintain minimum balance on withdrawal"); 
 } 
 else{ 
 balance-=amount; 
 } 
 } 
 void getBalance(){ 
 System.out.println("Current balance = " +balance); 
 } 
} 
public class Main { //Customer
 public static void main(String[] args){ 
 int ch; 
 float amount; 
 String currencyType; 
 Scanner s = new Scanner(System.in); 
 Account cust = new Account(); 
 while(true){ 
 System.out.println("1.Deposit\n2.Withdraw\n3.Check balance\nEnter your choice: "); 
 ch = s.nextInt(); 
 switch (ch){ 
 case 1: 
 System.out.println("Enter amount to deposit and currency type(Old/New): "); 
 amount = s.nextFloat(); 
 currencyType = s.next(); 
 cust.deposit(amount, currencyType); 
 break; 
 case 2: 
 System.out.println("Enter the amt to withdraw: "); 
 amount = s.nextFloat(); 
 cust.withdraw(amount); 
 break; 
 case 3: 
 cust.getBalance(); 
 break; 
 default: return; 
 } 
 } 
 } 
}
