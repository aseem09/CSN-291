public class Ticket {

  public int fare;               //fare of the ticket
  public int id;                 //id of ticket
  public String dateOfJourney;   //date of Journey
  public String timeOfJourney;   //time of Journey
  public String seatClass;       //class of seat
  public boolean isConfirmed;    //true if ticket is confirmed

  //prints the details of the ticket
  public void printTicket(){
  	 System.out.println("Fare = " + Integer.toString(fare));
  	 System.out.println("Id : " + Integer.toString(id));
  	 System.out.println("Date of Journey : " + dateOfJourney);
  	 System.out.println("Time of Journey : " + timeOfJourney);
  	 String status = (isConfirmed)?"Confirmed":"Waiting";
  	 System.out.println("Confirmation status : " + status + "\n");
  }
}



