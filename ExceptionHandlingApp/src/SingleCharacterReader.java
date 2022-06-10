import java.io.IOException;
public class SingleCharacterReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any character !");
		ch = (char) System.in.read();
		//return int - 'A' - returns 65
		System.out.println("The input character is :" + ch);
	}

}
