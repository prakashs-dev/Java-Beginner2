package railway.ticket.booking;

import java.util.ArrayList;
import java.util.Scanner;

class Train {
    private String name;
    private String source;
    private String destination;
    private String time;
    private int passengerStrength;
    private int trainNumber;

    public Train(String name, String source, String destination, String time, int passengerStrength, int trainNumber) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    public int getPassengerStrength() {
        return passengerStrength;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setPassengerStrength(int passengerStrength) {
        this.passengerStrength = passengerStrength;
    }
}

class ReservationSystem {
    private ArrayList<Train> trains;

    public ReservationSystem() {
        trains = new ArrayList<>();
        // Add sample trains
        trains.add(new Train("Mumbai Superfast", "Mumbai", "Delhi", "13:05", 50, 1010));
        trains.add(new Train("Delhi SuperFast", "Delhi", "Jaipur", "7:00", 50, 2013));
        trains.add(new Train("Prayagraj EXP", "Prayagraj", "Delhi", "10:00", 50, 3045));
        trains.add(new Train("Hyderabad Express", "Hyderabad", "Kashmir", "15:00", 50, 5030));
        trains.add(new Train("Jaipur SuperFast", "Jaipur", "Hyderabad", "4:00", 50, 7011));
        trains.add(new Train("Hyderabad Rajdhani Express", "Hyderabad", "Kashmir", "5:00", 50, 9000));

    }

    public void displayAvailableTrains(String source, String destination) {
        // Display available trains based on source and destination
        int flag=1;
        for (Train train : trains) {
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
                System.out.println("Train Number: " + train.getTrainNumber());
                System.out.println("Train Name: " + train.getName());
                System.out.println("Departure Time: " + train.getTime());
                System.out.println("Available Seats: " + train.getPassengerStrength());
                System.out.println();
                flag++;
            }
        }
        if(flag==1){
            System.out.println("No Train is there from "+source+" to "+destination);
        }
    }

    public int checkSeatAvailability(int trainNumber) {
        // Search for the train by its number
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                // Return the available seats for the selected train
                return train.getPassengerStrength();
            }
        }
        // Return -1 to indicate that the train was not found
        return -1;
    }

    public boolean bookTicket(int trainNumber, String passengerName) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber && train.getPassengerStrength() > 0) {
                // Decrease available seats and book the ticket
                train.setPassengerStrength(train.getPassengerStrength() - 1);
                System.out.println("Ticket booked for " + passengerName + " on Train " + trainNumber);
                return true;
            }
        }
        // Ticket booking failed
        System.out.println("Sorry, the train is full or not found.");
        return false;
    }

    public boolean cancelTicket(int trainNumber, String passengerName) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber && train.getPassengerStrength() < 50) {
                // Increase available seats and cancel the ticket
                train.setPassengerStrength(train.getPassengerStrength() + 1);
                System.out.println("Ticket for " + passengerName + " on Train " + trainNumber + " canceled.");
                return true;
            }
        }
        // Ticket canceling failed
        System.out.println("Ticket canceling failed. Train not found or invalid passenger.");
        return false;
    }

    public void displayTicketDetails(int trainNumber, String passengerName) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                // Display ticket details
                System.err.println("Ticket Details:");
                System.out.println("Train Name: " + train.getName());
                System.out.println("Train Number: " + train.getTrainNumber());
                System.out.println("Passenger Name: " + passengerName);
                System.out.println("Departure Time: " + train.getTime());
                // Add more ticket details here if needed
                return;
            }
        }
        // Ticket details not found
        System.out.println("Ticket details not found. Train not found or invalid passenger.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();

        System.out.println("Welcome to the Railway Reservation System");

        while (true) {
            System.out.println("1. Check Available Trains");
            System.out.println("2. Check Seat Availability");
            System.out.println("3. Book a Ticket");
            System.out.println("4. Cancel a Ticket");
            System.out.println("5. Display Ticket Details");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter source station: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination station: ");
                    String destination = scanner.nextLine();
                    reservationSystem.displayAvailableTrains(source, destination);
                    break;
                case 2:
                    System.out.print("Enter the train number to check seat availability: ");
                    int trainNumberToCheck = scanner.nextInt();
                    int availableSeats = reservationSystem.checkSeatAvailability(trainNumberToCheck);
                    if (availableSeats != -1) {
                        System.out.println("Available seats for Train " + trainNumberToCheck + ": " + availableSeats);
                    } else {
                        System.out.println("Train not found. Please enter a valid train number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the train number to book a ticket: ");
                    int trainNumberToBook = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter passenger name: ");
                    String passengerName = scanner.nextLine();
                    reservationSystem.bookTicket(trainNumberToBook, passengerName);
                    break;
                case 4:
                    System.out.print("Enter the train number to cancel a ticket: ");
                    int trainNumberToCancel = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter passenger name: ");
                    String passengerNameToCancel = scanner.nextLine();
                    reservationSystem.cancelTicket(trainNumberToCancel, passengerNameToCancel);
                    break;
                case 5:
                    System.out.print("Enter the train number to display ticket details: ");
                    int trainNumberToDisplay = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter passenger name: ");
                    String passengerNameToDisplay = scanner.nextLine();
                    reservationSystem.displayTicketDetails(trainNumberToDisplay, passengerNameToDisplay);
                    break;
                // Add cases for other functionalities
                case 6:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}