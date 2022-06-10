import java.util.Scanner;
public class MultipleCatchBlocksApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend, divisor, quotient, index, num;
		String strNum;
		Scanner scnr = new Scanner(System.in);
		try {
			dividend = 50;
			divisor = 10;
			quotient = dividend/divisor;
			System.out.println("Quotient " + quotient);
			
			float marks[] = {63.25f, 85.36f, 75.36f };
			System.out.println("Enter an integer");
			
			strNum=scnr.next();
			num=Integer.parseInt(strNum);
			System.out.println(marks[-2]);
			
		}catch(ArithmeticException aexcp) {
			System.err.println(aexcp.getMessage());
			
		}catch(ArrayIndexOutOfBoundsException aioobexcp) {
			System.err.println(aioobexcp.getMessage());
			
		}catch(NumberFormatException nfexcp) {
			System.err.println(nfexcp.getMessage());
		}finally {
			System.out.println("In Finally Block");
		}

	}

}
