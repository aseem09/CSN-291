public class Bank//All the ops related to bank
{
	
public String bankName;//bankname to be stored

	Bank(String bankName){
		this.bankName = bankName;
	}
	protected void debitFare(int fare)//takes input the fare and pass it to for payment
	{
		//object created of class Card to access its functions
		Card card = new Card(this,11223344,000, true);
        card.debitAmount(fare,bankName);//calling function which prompt card deatils and confirmation from bank
     	
	}
	protected boolean paymentConfirm()//this will be directed from class Card for payment confirmation through gateway
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