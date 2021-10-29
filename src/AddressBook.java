package Line_Conversion;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

    private ArrayList<contact> friends; // An array of Contacts - each stores info for one friend

    
    public AddressBook() {
        friends = new ArrayList<contact>();
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(contact c) {
        friends.add(c);
    }

    
    public void printContacts() {
        for (int i=0;i<friends.size();i++)
            System.out.println(friends.get(i));
    }

   
    public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Print out the  contacts you have.");
		System.out.println("3.Quit.");
		System.out.println("Enter your menu choice:");
    }
    
    public static void main(String[] args) {
    	Scanner inp=new Scanner(System.in);
    	AddressBook obj=new AddressBook();
    	menu();
    	int choice=inp.nextInt();
    	while (choice!=3) {
    	
    	if(choice==1) {
    		System.out.println("Enter First Name:");
    		String fName = inp.next();
    		System.out.println("Enter Last NAme");
    		String lName = inp.next();
    		System.out.println("Enter  phone number.");
    		int number = inp.nextInt();
    		System.out.println("Enter The City");
    		String city = inp.next();
    		System.out.println("Enter The State");
    		String state=inp.next();
    		System.out.println("Enter the pin code");
    		int pinCode=inp.nextInt();
    		obj.addContact(new contact(fName,lName,number,city,state,pinCode));
    		System.out.println("arraylst size"+obj.friends.size());
    		

    	
    	}
    	else if (choice==2) {
    		obj.printContacts();
    		
    	}
    	menu();
    	choice = inp.nextInt();
    }
    }
}
  
    