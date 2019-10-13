public class Reservation {
	
	public boolean statusConfirmed;   // Ticket confirmed or waiting
    public int trainNumber;           //Train number
    public Ticket ticket;             //train object

    Reservation(){}

    Reservation(boolean statusConfirmed, int trainNumber){
        this.trainNumber = trainNumber;
        this.statusConfirmed = statusConfirmed;
    }
        
    //function to display the information of ticket
    public void displayInfo() {
         System.out.print("The status of ticket is: ");
         if(statusConfirmed){
         	System.out.print("Confirmed");
         }         
         else{
         	System.out.print("Waiting");
         }
         System.out.print("\n");
         System.out.println("Train number: " + Integer.toString(trainNumber) + "\n");
     }

    //function to check availability of ticket
    public boolean checkAvailability(Database db ,Train t){
    	    boolean isAvailable = db.checkAvailiblity(t);  //true if a seat is available
    	    return isAvailable;
    }
    
    //executed on cancellation of ticket.Calculates the amount to be refunded
    public int refundAmount(){
    	int refundAmount = ticket.fare;
    	return refundAmount; 
    }
    
    //Cancels the reservation
    public void cancelReservation(){
        refundAmount();
        ticket= null;
    }
     
    //Calculates the fare and returns it 
    public int getFare(Train t1){
        return t1.distance * 1;
    }


}