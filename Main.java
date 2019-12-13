import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NoSuchCustomerException {
		System.out.println("Welcome to the Customer Application Program.");
		String cont = "y";
		int n;
		Scanner input = new Scanner(System.in);

		while (cont.equalsIgnoreCase("y")) {
			System.out.print("\nEnter a customer number: ");
			n = input.nextInt();
			Customer cust = CustomerIO.getCustomer(n);
			System.out.println(cust.getNameAndAddress());

			System.out.print("Display another customer? <y/n>: ");
			cont = input.next();
		}
		
		input.close();
		System.out.println("\nThank you for using our customer database. Goodbye.");
	}

}
