import java.util.Scanner;

public class Savings
{
    protected String accountNum;
    protected String PIN;
    private double balance;
    private double interestRate;
    private int month;
    Scanner input = new Scanner(System.in);
    
    public Savings(){
    }
    
    public Savings(String pin, String accNo, double bal, double rate, int month){
        this.accountNum = accNo;
        this.PIN = pin;
        this.balance = bal;
        this.interestRate = rate;
        this.month = month;
    } //constructor
    
    public double getInterestRate(){
        return this.interestRate;
   }
   
   public void setInterestRate(double rate){
       this.interestRate = rate;
   }
   
   double getMonth(){
       return this.month;
   }
   
   public void setMonth(int month){
       this.month = month;
   }
   
   
   public double interestPaid(){
       double interest = this.balance*(1+interestRate*8) - this.balance;
       return interest;
   }
   
   public double getBalance() {
       return this.balance;
    }
    
    public void setBalance(double bal) {
       this.balance = bal;
    }

   public void addInterest(){    
       this.balance = this.balance + interestPaid();
   }
   
   public void checkBalance(){
        System.out.println("$ " + this.balance);
    }
   
   public void deposit() {
       boolean right = true;
       double depositAmount = 0;
       while (right){
           try{
                System.out.print("How much would you like to deposit: ");
                depositAmount = input.nextDouble();
                right = false;
           }
           catch(Exception e){
               System.out.println("Please enter digits");
           }
       }
        
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