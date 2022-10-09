import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Admin
{
    ArrayList<User> userlist;
    protected String accountNum;
    protected String PIN;
    Scanner sc = new Scanner(System.in);
    Checkings ch = new Checkings();
    Savings sh = new Savings();
    Menu menu = new Menu();
    
    
    
    public Admin(){
        userlist = new ArrayList<User>();
    }
    
    public void addUser(){
        
        System.out.print("Enter new account number: ");
        String accountNo = sc.nextLine();
        System.out.print("Enter Pin: ");
        String pN = sc.nextLine();
        System.out.println("User Added Suscesfully!!");
        
        userlist.add(new User(accountNo, pN));
    }
    public void deleteUser(){
        System.out.print("Enter account number to delete: ");
        String accNum = sc.next();
        int flag1 = 0;
        Iterator<User> it = userlist.iterator();
        while (it.hasNext()){
            if (it.next().getAccountNumber().equals(accNum)){
                flag1 = 1;
                it.remove();
            }
            if (flag1 == 1){
                System.out.println("User removed successfully");
            }else{
                System.out.println("User " + accountNum + " not found!");
            }
        break;
        }
    }
    
    public ArrayList<User> getUserList(){
        return userlist;
    }
    
    public void listUsers(){
        for (int j = 0; j < userlist.size(); j++){
            System.out.println(userlist);
        }
    }
    
    public void applyInterest(){
        for (int i = 0; i < userlist.size(); i++){
            userlist.get(i).getSavings().addInterest();
            System.out.print("Interest applied");
        }
    }
    
    public int run(){
        boolean exitRequested = false;
        while (!exitRequested) {
            System.out.println("Welcome Admin!");
            menu.adminMenu();
	        int adminChoice = Integer.parseInt(sc.nextLine());
	        switch (adminChoice){
	            case 0:
	                addUser();
	                break;
                case 1:
                    deleteUser();
                    break;
                case 2:
                    listUsers();
                    break;
                case 3:
                    applyInterest();
                    break;
                case 4:
                    exitRequested = true;
                default:
                    System.out.println("Wrong Input");
                    break;
	        }//end switch
        }//end while
        return 0;
    }//end method
}


//to access the checkings or savings from the main
//Admin.getUserList().get(0).getCheckings