package in.flipcart.paymentservices.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.flipcart.paymentservices.beans.PayPal;
import in.flipcart.paymentservices.beans.PaymentGatewayServices;
import in.flipcart.paymentservices.beans.Razorpay;
import in.flipcart.paymentservices.beans.Stripe;
import in.flipcart.paymentservices.config.PaymentConfiguration;

public class PaymentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfiguration.class);
		PaymentGatewayServices service = context.getBean(PaymentGatewayServices.class);
		service.processPayment(1000);
		service.validatePayment("suc234444");
		service.refundPayment("ref574892");
		
		
	}
}
