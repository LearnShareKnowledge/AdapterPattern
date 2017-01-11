/**
 * Created by 310124463 on 11/01/17.
 */
public class XPayImplementation implements XPay {

    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;


    @Override
    public String getCreditCardNumber() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public short getCardCVVNumber() {
        return cardCVVNo;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {

        this.creditCardNo = creditCardNo;

    }

    @Override
    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {

        this.cardExpMonth = cardExpMonth;

    }

    @Override
    public void setCardExpYear(String cardExpYear) {

        this.cardExpYear = cardExpYear;

    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;

    }

    @Override
    public void setAmount(Double amount) {

        this.amount = amount;

    }
}
