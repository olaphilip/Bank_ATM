import java.util.Scanner;

public class Checkings
{
    protected String accountNum;
    protected String PIN;
    private double balance = 0;
    Scanner input = new Scanner(System.in);
    
    public Checkings(){
        
    }
    public Checkings(String accNum, String pin, double bal){
        this.accountNum = accNum;
        this.PIN = pin;
        this.balance = bal;
    } //constructor
    
    public double getBalance() {
       return this.balance;
    }
    
    public void setBalance(double bal) {
       this.balance = bal;
    }
    
    public void checkBalance(){
        System.out.println("$ " + this.balance);
    }
    
    public void deposit() {
        System.out.print("How much would you like to deposit: ");
        double depositAmount = input.nextDouble();
        if (depositAmount > 0){
            this.balance += depositAmount;
            System.out.println("Amount of " + String.format("%.2f", depositAmount) + " has been deposited");
            System.out.println("Your new balance: " + this.balance);
        } else {
            System.out.println("Cannot deposit Amount");
        }
   }

   public void withdraw(){
       System.out.print("How much would you like to withdraw: ");
       double withdrawAmount = input.nextDouble();
       if (withdrawAmount < this.balance){
           System.out.println("Insufficient Funds!");
       }
       else{
           this.balance = this.balance - withdrawAmount;
           System.out.println("Your new balance: " + String.format("%.2f", withdrawAmount));
       }
   }

}