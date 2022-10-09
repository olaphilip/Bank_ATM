public class Menu
{
    void userMenu(){
        System.out.println("What would you like to do today?");
        System.out.println("0) Check Checkings Account Balance");
        System.out.println("1) Deposit into Checkings");
        System.out.println("2) Withdraw from Checkings");
        System.out.println("3) Check Savings Account Balance");
        System.out.println("4) Deposit into Savings");
        System.out.println("5) Withdraw from Savings");
        System.out.println("6) Exit");
    }
    void adminMenu(){
        System.out.println("0) Add User");
        System.out.println("1) Delete User");
        System.out.println("2) List User");
        System.out.println("3) Apply Interest to Accounts");
        System.out.println("4) Exit");
    }
}