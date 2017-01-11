/**
 * Created by 310124463 on 11/01/17.
 */
public interface YPay {

    public String getCreditCardNumber();

    public String getCustomerName();

    public short getCardCVVNumber();

    public double getAmount();

    // This is the change in the new payment api --

    public String getCardExpMonthYear();




    public void setCreditCardNo(String creditCardNo);

    public void setCustomerName(String customerName);

    public void setCardExpMonthYear(String cardExpMonthYear);

    public void setCardCVVNo(Short cardCVVNo);

    public void setAmount(Double amount);

}
