package zoho.taxi;

import java.util.ArrayList;

public class TaxiBookingSystem {

	private static ArrayList<Taxi> taxiList = new ArrayList<>();
	private static ArrayList<Taxi> taxiBookingHistory = new ArrayList<>();
	private static int taxiLimit = 4, idGenerator = 1;

	public static String booking(char pickupLoc, char dropLoc, int pickUpTime) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		if (taxiList.size() < taxiLimit) {
			taxiList.add(new Taxi());
		}
		int getMinLoc = Integer.MAX_VALUE;
		Taxi readyTaxi = null;

		for (Taxi t : taxiList) {
			if (t.getDropTime() <= pickUpTime && Math.abs(pickupLoc - t.getCurrentLocation()) <= getMinLoc) {
				readyTaxi = t;
				getMinLoc = Math.abs(pickupLoc - t.getCurrentLocation());
			}
		}
		if (readyTaxi != null) {
			readyTaxi.setCustomerID(idGenerator);
			readyTaxi.setPickUpLoc(pickupLoc);
			readyTaxi.setPickUpTime(pickUpTime);
			readyTaxi.setDropLoc(dropLoc);
			readyTaxi.setCurrentLocation(dropLoc);
			readyTaxi.setDropTime(pickUpTime + Math.abs(dropLoc - pickupLoc));
			readyTaxi
					.setTotalEarnings(readyTaxi.getTotalEarnings() + Math.abs(dropLoc - pickupLoc) * (100 + (10 * 10)));
			readyTaxi.setTaxiID(taxiList.indexOf(readyTaxi) + 1);
			taxiBookingHistory.add((Taxi) readyTaxi.clone());
		}
		return readyTaxi != null ? "Taxi Number "+readyTaxi.getTaxiID()+" is Successfully Booked..!" : "Taxi no Available";
	}

	public static void display() {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------");
		for (Taxi t : taxiBookingHistory) {
			System.out.println(t.toString());
			System.out.println("---------------------------------");
		}

	}

}
