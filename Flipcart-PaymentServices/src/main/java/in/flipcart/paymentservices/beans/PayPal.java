package in.flipcart.paymentservices.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PayPal implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub	
		System.out.println("Payment is processed through PayPal Gateway "+ amount);
	}

	@Override
	public void validatePayment(String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("Paypal Transaction Id is "+ transactionId);
	}

	@Override
	public void refundPayment(String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("Paypal Refund is processed with transaction id "+transactionId);
	}

}
