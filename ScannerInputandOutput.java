import java.util.Scanner;

public class ScannerInputandOutput {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.print("Enter any Two Numbers: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();//nextINt is used to input integer value from console
		b = s.nextInt();
		
		c = a + b;
		System.out.print("Sum of Two Numbers: "+c);

	}

}
