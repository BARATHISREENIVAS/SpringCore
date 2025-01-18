
package in.flipcart.paymentservices.beans;

import org.springframework.stereotype.Component;

@Component
public class Stripe implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment is processed with strip PaymentGateway "+ amount);
	}

	@Override
	public void validatePayment(String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("Payment is validated through Strip PaymentGateway"+ transactionId);
	}

	@Override
	public void refundPayment(String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("Refund amount is processed through Strip Gateway and transaction gateway is"+ transactionId);
	}

}
