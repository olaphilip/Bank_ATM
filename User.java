import java.util.Scanner;

public class User
{
    protected String accountNum;
    protected String PIN;
    
    Checkings ca = new Checkings();
    Savings sa = new Savings();
    Menu menu = new Menu();
    
    public User(){
        
    }//default constructor
    
    public User(String userAcc, String userPin){
        this.accountNum = userAcc;
        this.PIN = userPin;
    }
    
    public Savings getSavings(){
        return this.sa;
    }
    
    public String getPIN() {
       return this.PIN;
    }
   
    public String getAccountNumber(){
        return accountNum;
        
    }
    
    public int run(){
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
	    menu.userMenu();
	    int userChoice = Integer.parseInt(input.nextLine());
	    boolean found = false;
	    
        switch (userChoice){
            case 0:
	            ca.checkBalance();
	            break;
            case 1:
                ca.deposit();
                break;
            case 2:
                ca.withdraw();
                break;
            case 3:
                sa.checkBalance();
                break;
            case 4:
                sa.deposit();
                break;
            case 5:
                sa.withdraw();
                break;
            default:
                System.out.println("Wrong Input");
                break;
	    }
	    return 0;
    }
}