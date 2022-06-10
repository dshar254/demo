
public class NullPointerExcpApp {

	public static void main(String[] args) {
		
		String str="Hello";
		try {
			str=null;
			System.out.println(str.length());
		}catch(NullPointerException npexcp) {
			System.err.println(npexcp.getMessage());
		}

	}

}
