
public class NegativeArraySizeApp {

	public static void main(String[] args) {
		try {
			float scores[] = new float[-20];
			scores[0] = 25.25f;
		}
		catch(NegativeArraySizeException nasexcp) {
			System.err.println(nasexcp.getMessage());
		}
	}

}
