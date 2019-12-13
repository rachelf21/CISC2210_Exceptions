
public class NoSuchCustomerException extends Exception{
		
	public NoSuchCustomerException(String custNum) {
		System.out.println("Customer " + custNum + " does not  exist.");
	}
}
