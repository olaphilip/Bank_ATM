import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    protected String accountNum;
    
	public static void main(String[] args) throws IOException {
	    Scanner input = new Scanner(System.in);
	    boolean exitRequested = false;
	    Admin admin = new Admin();
	    User user = new User();
	    
	    System.out.println("Thank you for choosing RETH (Ridiculously Easy to Hack) bank");
		for (int i = 0; i < 3; i++){
		    System.out.print("Please enter your account number: ");
		    String accountNum = input.nextLine();
		    System.out.print("Please enter your pin: ");
            String pin = input.nextLine();
        
            if (accountNum.equals("00000") && pin.equals("12345")){
            admin.run();
            }
            else if (accountNum.equals("00000") && !pin.equals("12345")){
                System.out.println("Incorrect Password, please try again!");
            }else {
                for (int j = 0; i < admin.userlist.size(); j++) {
                    if (accountNum.equals(admin.userlist.get(j).getAccountNumber())) {              
                        if (pin.equals(admin.userlist.get(i).getPIN())){
                            admin.userlist.get(j).run();
                        } else{
                            System.out.println("You dont have a bank with us, thank you!");
                        }
                    } else {
                        System.out.println("You dont have a bank with us, thank you!");
                    }
	            }
            }
	    }

    } //end main
}//end class