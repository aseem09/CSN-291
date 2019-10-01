public class Bank//All the ops related to bank
{
	
public String bankName;//bankname to be stored

	protected void debitFare(int Fare)//takes input the fare and pass it to for payment
	{
		Card obj=new Card();//object created of class Card to access its functions
        obj.debitAmount(Fare,bankName);//calling function which prompt card deatils and confirmation from bank
     	
	}
	protected boolean paymentConfirm()//this will be directed from class Card for payment confirmation through gateway
	{
		int signal=0;
		//if payment is made successfully signal 1
		if(signal==1)
			return true;
		//if payment is unsuccessful signal 0
		else{
			return false;
		}
	}
}