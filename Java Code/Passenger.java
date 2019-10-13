class Passenger{

	public String name;
	public int age;
	public String gender;
	public String address;
	public int phoneNo;

	public Ticket reservation(Database db, Reservation reservation, Train t1,Bank bank){
		
		reservation = new Reservation(false, t1.trainNumber);

		makePayment(bank, reservation.getFare(t1));

		if(reservation.checkAvailability(db,t1)){
			reservation.statusConfirmed = true;
		}

		Ticket ticket = new Ticket();
		ticket.fare = reservation.getFare(t1);
		ticket.dateOfJourney =  t1.date;
		ticket.id = t1.trainNumber;
		ticket.isConfirmed = reservation.statusConfirmed;
		ticket.timeOfJourney = t1.departureTime;
		reservation.ticket = ticket;

		reservation.displayInfo();
		ticket.printTicket();
		return reservation.ticket;
	}
	public void cancellation(Reservation r1){
		r1.cancelReservation();
	}
	public Train searchTrain(Database db,int trainNumber){
		return db.searchTrain(trainNumber);	
	}
	protected void makePayment(Bank bank,int fare){
		bank.debitFare(fare);
	}
}