
public class ArrayIndexBoundsExcpApp {

	public static void main(String[] args) {
		int scores[] = {96,85,96,84,86,76,95,83,84,87};
		//for each loop
		for(int score : scores ) {
			System.out.println(score);
		}
		try {
			System.out.println(scores[10]);
		}
		catch(ArrayIndexOutOfBoundsException aioobexcp ) {
			System.out.println("The message from exception is : " + aioobexcp.getMessage());
			
			String index = aioobexcp.getMessage();
			System.out.println("Index = " + index);
		}finally {
			System.out.println("In the finally block");
		}
	}

}
