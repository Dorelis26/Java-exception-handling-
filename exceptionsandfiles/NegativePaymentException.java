package exceptionsandfiles;

public class NegativePaymentException extends Exception{
	double payment;
	
	public NegativePaymentException(double payment) {
		
		this.payment=payment;
	}
	@Override
	public String toString() {
		return "ERROR : cannot take negative payment" +payment;
	}
}
