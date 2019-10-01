class Passenger{

	public String name;
	public int age;
	public String gender;
	public String address;
	public int phoneNo;

	public Ticket reservation(Train t1, String seatClass){
		Reservation reservation = new Reservation(false,t1.trainNumber);

		Ticket ticket = new Ticket();
		ticket.fare = reservation.getFare(t1);
		//ticket.dateOfJourney = t1.dateOfJourney;
		ticket.id = t1.trainNumber;
		ticket.isConfirmed = reservation.statusConfirmed;
		ticket.seatClass = seatClass;
		ticket.timeOfJourney = t1.departureTime;
		reservation.ticket = ticket;

		Bank bank = new Bank();
		makePayment(bank, reservation.getFare(t1));

		reservation.statusConfirmed = reservation.checkAvailability(t1);
		reservation.displayInfo();

		return reservation.ticket;
	}
	public void cancellation(Reservation r1){
		r1.cancelReservation();
	}
	public Train searchTrain(Train t1){
		Database db= new Database();
		return db.searchTrain(t1.trainNumber);
		
	}

	protected void makePayment(Bank bank,int fare){
		bank.debitFare(fare);
	}
}