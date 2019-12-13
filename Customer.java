
public class Customer {
	String name;
	String address;
	String city;
	String state;
	String zipCode;
	
	public Customer() {
	}
		
	public String getNameAndAddress() {
		String info;
		if(name.equals("")) 
			info = "";
		else
			info=name +"\n"+address+"\n"+city+", "+state+ " " + zipCode+"\n";
		return info;
	}
}
