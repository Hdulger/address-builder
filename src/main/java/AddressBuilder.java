import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder address=new StringBuilder();
        System.out.println("Enter your full name");
        address.append(scanner.nextLine()).append("\nBilling Address:\n");


        System.out.println("Enter your Billing Street: ");
        address.append(scanner.nextLine()).append("\n");

        System.out.println("Enter your Billing city: ");
        address.append(scanner.nextLine()).append(", ");

        System.out.println("Enter your Billing State: ");
        address.append(scanner.nextLine()).append(" ");

        System.out.println("Enter your Billing Zip: ");
        address.append(scanner.nextLine()).append("\n\nShipping Address:\n");


        System.out.println("Enter your Shipping Street: ");
        address.append(scanner.nextLine()).append("\n");

        System.out.println("Enter your Shipping city: ");
        address.append(scanner.nextLine()).append(", ");

        System.out.println("Enter your Shipping State: ");
        address.append(scanner.nextLine()).append(" ");

        System.out.println("Enter your Shipping Zip: ");
        address.append(scanner.nextLine()).append("\n");

        System.out.println(address);

    }


}
