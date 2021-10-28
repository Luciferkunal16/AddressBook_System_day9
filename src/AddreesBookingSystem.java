package Line_Conversion;

import java.util.Scanner;

public class AddreesBookingSystem {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int pincode;
	long phoneNumber;
	String email;
	
	
	void addPerson() {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Person First Name");
	    firstName=inp.nextLine();
	    System.out.println("Enter Person Last Name ");
	    lastName=inp.nextLine();
	    System.out.println("Enter The Address ");
	    address=inp.nextLine();
	    System.out.println("Enter The City");
	    city=inp.nextLine();
	    System.out.println("Enter The State");
	    state=inp.nextLine();
	    System.out.println("Enter The Pin code");
	    pincode=inp.nextInt();
	    System.out.println("Enter The Phone Number");
	    phoneNumber=inp.nextInt();
	    System.out.println("Enter The E-Mail");
	    email=inp.nextLine();
	}
	
	public static void main(String[] args) {
		AddreesBookingSystem obj=new AddreesBookingSystem();
		
		System.out.println("Welcome to Address Book Program");
		obj.addPerson();
	}
	
	

}
