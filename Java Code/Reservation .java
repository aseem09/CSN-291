public class Reservation extends Passenger {
	
	public boolean statusConfirmed;   // Ticket confirmed or waiting
    public int trainNumber;           //Train number
    public Ticket ticket;             //train object

    Reservation(boolean statusConfirmed, int trainNumber){
        this.trainNumber = trainNumber;
        this.statusConfirmed = statusConfirmed;
    }
        
    //function to display the information of ticket
    public void displayInfo() {
         System.out.println("The status of ticket is: ");
         if(statusConfirmed){
         	System.out.print("Confirmed");
         }         
         else{
         	System.out.print("Waiting");
         }
         System.out.println("Train number: " + Integer.toString(trainNumber));
     }

    //function to check availability of ticket
    public boolean checkAvailability(Train t){
            //creates a database object to check availability
    	    Database databaseObject = new Database();
    	    boolean isAvailable = databaseObject.checkAvailible(t);  //true if a seat is available
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