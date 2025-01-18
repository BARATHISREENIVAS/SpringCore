package in.flipcart.paymentservices.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayServices {

	
	private PaymentGateway paymentGateway;
	@Autowired
	public PaymentGatewayServices(@Qualifier("razorpay") PaymentGateway paymentGateway) {
		super();
		this.paymentGateway = paymentGateway;
	}
	public void processPayment(double amount) {
		paymentGateway.processPayment(amount);
	}
	public void validatePayment(String transactionId) {
		paymentGateway.validatePayment(transactionId);
	}
	public void refundPayment(String transactionId) {
		paymentGateway.refundPayment(transactionId);
	}
	
}
