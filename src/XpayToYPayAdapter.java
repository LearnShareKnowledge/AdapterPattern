/**
 * Created by 310124463 on 11/01/17.
 */
public class XpayToYPayAdapter implements YPay {


    private final XPay xPay   ;

    String creditCardNo;

    String customerName;

    String cardExpMonthYear;

    Short cardCVVNo;

    Double amount;



    public XpayToYPayAdapter(XPay xpay) {

        xPay = xpay;
    }

    @Override
    public String getCreditCardNumber() {
        return xPay.getCreditCardNumber();
    }

    @Override
    public String getCustomerName() {
        return xPay.getCustomerName();
    }

    @Override
    public short getCardCVVNumber() {
        return xPay.getCardCVVNumber();
    }

    @Override
    public double getAmount() {
        return xPay.getAmount();
    }

    @Override
    public String getCardExpMonthYear() {
        return xPay.getCardExpMonth()+"/"+xPay.getCardExpYear();
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
    public void setCardExpMonthYear(String cardExpMonthYear) {
            this.cardExpMonthYear = cardExpMonthYear;
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
