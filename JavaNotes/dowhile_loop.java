import java.util.Scanner;

public class dowhile_loop {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter any number: ");
		Scanner s =new Scanner(System.in);
		
		num = s.nextInt();
		do
		{
			System.out.println("Learn Coding");
			++num;
		}
		while(num<=10);
		

	}

}
