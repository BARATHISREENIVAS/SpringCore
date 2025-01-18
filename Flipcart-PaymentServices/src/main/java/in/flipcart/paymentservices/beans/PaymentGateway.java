package in.flipcart.paymentservices.beans;

public interface PaymentGateway {

	public void processPayment(double amount);
	public void validatePayment(String transactionId); 
	public void refundPayment(String transactionId);
}
