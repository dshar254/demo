
public class NumberFormatExcpApp {

	public static void main(String[] args) {
		String mobileNo = "987-987-9871";//occupies 2*10 = 20bytes
		try {
			long mobNo = Long.parseLong(mobileNo);//converts string into long
			System.out.println("Mobile no after converting in to long type : " + mobNo);
		}catch(NumberFormatException nfexcp) {
			
			System.err.println( nfexcp.getMessage());
		}finally {
			System.out.println("In the finally block");
		}
		//long mobNo2 = Long.parseLong(mobileNo);
		//converts string into long

	}

}
