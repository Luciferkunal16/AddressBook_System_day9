package Line_Conversion;
public class contact {

	    private int phonenumber; // Stores phone number of contact
	    private String fName;
	    private String lName;
	    private String city;
	    private String state;
	    private int pinCode;
	    // Stores birthday in an int

	    // Creates Contact object based on parameters.
	    public contact(String firstName, String lastName,  int phoneNumber ,String city,String state,int pinCode) {
			fName = firstName;
			lName=lastName;
			city=this.city;
			phonenumber = phoneNumber;
			state=this.state;
			pinCode=this.pinCode;
			
	    }
	    public String getCity() {
	    	return city;
	    }
	    public String getState(){
	    	return state;
	    }
	   
	    public int getNumber(int newnum) {
			return phonenumber;
	    }
	    public String getfName() {
	    	return fName;
	    }
	    public String getlName() {
	    	return lName;
	    }

	    public int getNumber() {
			return phonenumber;
	    }

	  
	    public String toString() {
	        return  " FName: " + fName + " Last Name: "+lName+" Phone#: " + phonenumber+" City: "+city+" State: "+state +" Pin Code: "+pinCode ;
	        
	                
	    }

	    
	    
}


	
	


