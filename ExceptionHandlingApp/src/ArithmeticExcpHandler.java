import java.util.Scanner;
public class ArithmeticExcpHandler {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int dividend, divisor;
		System.out.println("Enter Dividend");
		dividend = scnr.nextInt();
		System.out.println("Enter Divisor");
		divisor = scnr.nextInt();
		int quotient;
		try {
			quotient = dividend / divisor;
			System.out.println("Quotient = " + quotient);
		}
		catch(ArithmeticException arithexcp) {
			System.out.println(arithexcp);
			
			String excpMsg = arithexcp.getMessage();
			
			if(excpMsg.equals("/ by zero")) {
				System.out.println("Arithmetic exception occured ");
			}
			//System.err.println( "Message from ArithmeticException Object :" + arithexcp.getMessage() );
			
			
			
		}finally {
			System.out.println("In the finally block !");
		}
		

	}

}
