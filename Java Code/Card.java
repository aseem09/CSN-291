public class Card//Payment of charges and confirmation of user to be done here
{
    protected int cardNumber;//stores the card number
    public    int cvv;//storess the cvv number
    protected boolean isCreditCard;
    Bank bank; 

    Card(){}

    Card(Bank bank, int cardNumber, int cvv, boolean isCreditCard){
      this.cardNumber = cardNumber;
      this.cvv = cvv;
      this.isCreditCard = isCreditCard;
      this.bank = bank;
    }
 
    protected void debitAmount(int amount,String bankName)
      {
        boolean temp= bank.paymentConfirm();
          System.out.println("******PAYMENT DETAILS******");
          System.out.println("Bank Name: "+ bankName);
          System.out.println("Card No: "+ cardNumber);
          System.out.println("Amount : "+ amount);

 	      if(temp != true)
 	  	    System.out.println("Payment Unsuccessful\n");
 	      else
 		      System.out.println("Payment Successful\n");
      }
}
