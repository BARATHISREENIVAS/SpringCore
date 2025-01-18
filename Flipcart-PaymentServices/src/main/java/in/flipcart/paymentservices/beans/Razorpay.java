package in.flipcart.paymentservices.beans;

import org.springframework.stereotype.Component;

@Component
public class Razorpay implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment is processed through RazorPay and the amount is "+ amount);
	}

	@Override
	public void validatePayment(String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("Razorpay transaction id is "+ transactionId);
	}

	@Override
	public void refundPayment(String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("RazoPay refund is processed "+ transactionId);
	}

}
