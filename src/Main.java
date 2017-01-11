/**
 * Created by 310124463 on 11/01/17.
 */
public class Main {

    public static void main(String [] args)
    {
        XPay xpay = new XPayImplementation();

        xpay.setCustomerName("John");

        xpay.setAmount(2000.00);

        xpay.setCreditCardNo("4001 4002 4003 4004");

        xpay.setCardCVVNo((short) 672);

        xpay.setCardExpMonth("12");

        xpay.setCardExpYear("2019");

        // Pass this xpay object further for payment --

        YPay yPay = new XpayToYPayAdapter(xpay);

        // Pass this yPay to the YPay payment gateway

        System.out.println(yPay.getAmount());

        System.out.println(yPay.getCardExpMonthYear());



    }
}
