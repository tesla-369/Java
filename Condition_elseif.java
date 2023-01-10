import java.util.Scanner;

public class Condition_elseif {
	
	public static void main(String[] args) {
		
		int marks;
		System.out.println("Enter Marks: ");
		Scanner obj= new Scanner(System.in);
		marks = obj.nextInt();
		if(marks>=60 && marks<=80)
		{
			System.out.println("First Divison");
		}
		else if(marks>=80 && marks<=100)
		{
			System.out.println("Distinction");
			
		}
		else
		{
			System.out.println(" you are worthless for this world.");
		}
		
	}

}
