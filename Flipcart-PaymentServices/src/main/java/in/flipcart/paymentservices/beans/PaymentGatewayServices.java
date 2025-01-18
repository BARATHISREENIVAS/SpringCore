package in.flipcart.paymentservices.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayServices {

	
	private PaymentGateway paymentGateway;
	@Autowired
	public PaymentGatewayServices( PaymentGateway paymentGateway) {
		super();
		this.paymentGateway = paymentGateway;
	}
	
	
}
