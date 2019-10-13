public class Card//Payment of charges and confirmation of user to be done here
{
    protected int cardNumber;//stores the card number
    public    int cvv;//storess the cvv number
    protected boolean isCreditCard;
    Bank bank;
 
    protected void debitAmount(int amount,String bankName)//passes to bank server for payment
      {
        //You will be directed to bank server for the card details entered
        boolean temp= bank.paymentConfirm();//payment confirmation 
          System.out.println("******PAYMENT DETAILS******");
          System.out.println("Bank Name: "+ bankName);
 	      if(temp != true)
 	  	    System.out.println("Payment Unsuccessful\n");
 	      else
 		      System.out.println("Payment Successful\n");
      }
}
