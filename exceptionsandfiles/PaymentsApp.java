package exceptionsandfiles;
import java.util.Scanner;
public class PaymentsApp {

	public static void main(String[] args) {
		// take payment from user
		
		double payment =0;
		boolean positivePayment = true;
		
		do {
			System.out.print("enter payment amount: ");
		
			//get amount and test the value
			Scanner scan =new Scanner(System.in);
			//handle exeptions
			try {
			 payment = scan.nextDouble();
			if (payment <0) {
				//throw error
				throw new NegativePaymentException(payment);
				
			}else {
				positivePayment=true;
			}
			}catch(NegativePaymentException e) {
				System.out.println("ERROR");
				System.out.println(e.toString());
				positivePayment = false;
			}
		}while(!positivePayment);
		
		//print fonfirmation
		System.out.println("Thank you for your payment of "+ payment);

	}

}
