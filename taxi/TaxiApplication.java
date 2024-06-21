package zoho.taxi;

import java.util.Scanner;

public class TaxiApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to Taxi Booking System");
			System.out.println("1. TaxiBooking \n2. Display Taxi \n3. Exit");
			System.out.print("Select an Option : ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.print("Enter Pick Up Location : ");
				char pickupLoc = sc.next().charAt(0);
				System.out.print("Enter Drop Location : ");
				char dropLoc = sc.next().charAt(0);
				System.out.print("Enter Pick Up Time : ");
				int pickUpTime = sc.nextInt();
				System.out.println(TaxiBookingSystem.booking(pickupLoc, dropLoc, pickUpTime));
				break;
			case 2:
				TaxiBookingSystem.display();
				break;
			case 3:
				System.out.println("Existing Application, Thank You");
				sc.close();
				System.exit(0);
				break;
			}
		}

	}
}
