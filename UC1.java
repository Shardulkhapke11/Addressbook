import java.util.Scanner;

public class UC1 {
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    long PhoneNumber;
    String Email;

    public static void main(String[] args) {
        Scanner shardul = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter FirstName :");
        String FirstName = shardul.next();
        System.out.println("Enter LastName :");
        String LastName = shardul.next();
        System.out.println("Enter Address");
        String Address = shardul.next();
        System.out.println("Enter City");
        String City = shardul.next();
        System.out.println("Enter Zip");
        String Zip = shardul.next();
        System.out.println("Enter PhoneNumber");
        String PhoneNumber = shardul.next();
        System.out.println("Enter Email");
        String Email = shardul.next();

        System.out.println("FirstName is: " + FirstName);  // Output user input

        System.out.println("LastName is: " + LastName);  // Output user input

        System.out.println("Address is: " + Address);  // Output user input

        System.out.println("City is: " + City);  // Output user input

        System.out.println("Zip is: " + Zip);  // Output user input

        System.out.println("PhoneNumber is: " + PhoneNumber);  // Output user input

        System.out.println("Email is: " + Email);  // Output user input
    }

}

