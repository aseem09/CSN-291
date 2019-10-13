public class Bank//All the ops related to bank
{
	//bankname to be stored
	public String bankName;

	Bank(){}
	
	Bank(String bankName){
		this.bankName = bankName;
	}

	//takes input the fare and pass it to for payment
	protected void debitFare(int fare)
	{
		//object created of class Card to access its functions
		Card card = new Card(this,11223344,000, true);
		//calling function which prompt card deatils and confirmation from bank
        card.debitAmount(fare,bankName);
     	
	}

	//this will be directed from class Card for payment confirmation through gateway
	protected boolean paymentConfirm()
	{
		int signal = 1;
		//if payment is made successfully signal 1
		if(signal != 1)
			return false;
		//if payment is unsuccessful signal 0
		else{
			return true;
		}
	}
}