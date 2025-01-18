package in.flipcart.paymentservices.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.flipcart.paymentservices.beans.PayPal;
import in.flipcart.paymentservices.beans.Razorpay;
import in.flipcart.paymentservices.beans.Stripe;
import in.flipcart.paymentservices.config.PaymentConfiguration;

public class PaymentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfiguration.class);
		PayPal paypal = context.getBean(PayPal.class);
		paypal.processPayment(1000);
		paypal.validatePayment("pl903838383");
		paypal.refundPayment("pl89522222ref");
		
		
	}
}
