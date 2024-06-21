package zoho.taxi;

public class Taxi implements Cloneable {

	private char currentLocation = 'A';
	private int taxiID;
	private int customerID;
	private char pickUpLoc;
	private char dropLoc;
	private int pickUpTime;
	private int dropTime;
	private int totalEarnings;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

	public char getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(char currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getTaxiID() {
		return taxiID;
	}

	public void setTaxiID(int taxiID) {
		this.taxiID = taxiID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public char getPickUpLoc() {
		return pickUpLoc;
	}

	public void setPickUpLoc(char pickUpLoc) {
		this.pickUpLoc = pickUpLoc;
	}

	public char getDropLoc() {
		return dropLoc;
	}

	public void setDropLoc(char dropLoc) {
		this.dropLoc = dropLoc;
	}

	public int getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(int pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public int getDropTime() {
		return dropTime;
	}

	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}

	public int getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(int totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	@Override
	public String toString() {
		return "Taxi [currentLocation=" + currentLocation + ", taxiID=" + taxiID + ", customerID=" + customerID
				+ ", pickUpLoc=" + pickUpLoc + ", dropLoc=" + dropLoc + ", pickUpTime=" + pickUpTime + ", dropTime="
				+ dropTime + ", totalEarnings=" + totalEarnings + "]";
	}

}
