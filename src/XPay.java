/**
 * Created by 310124463 on 11/01/17.
 */
public interface XPay {

    public String getCreditCardNumber();

    public String getCustomerName();

    public short getCardCVVNumber();

    public double getAmount();

    public String getCardExpMonth();

    public String getCardExpYear();

    public void setCreditCardNo(String creditCardNo);

    public void setCustomerName(String customerName);

    public void setCardExpMonth(String cardExpMonth);

    public void setCardExpYear(String cardExpYear);

    public void setCardCVVNo(Short cardCVVNo);

    public void setAmount(Double amount);


}
