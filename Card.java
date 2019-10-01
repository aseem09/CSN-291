public class Card//Payment of charges and confirmation of user to be done here
{
    protected int cardNumber;//stores the card number
    public    int cvv;//storess the cvv number
    protected boolean isCreditCard;
 
    protected void debitAmount(int amount,String bankName)//passes to bank server for payment
      {
   //You will be directed to bank server for the card details entered
 	Bank obj=new Bank();
 	boolean cn=obj.paymentConfirm();//payment confirmation 
 	if(cn==true)
 		System.out.println("Payment Successfull");
 	else
 		System.out.println("Payment Unsuccessfull");
 }
}
