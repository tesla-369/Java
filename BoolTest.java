//Demonstrate boolean value
class BoolTest {
	public static void main(String args[]) {
		boolean b;
		
		b = false;
		System.out.println("b is: "+b);
		b = true;
		System.out.println("b is: "+b);
		
		//boolean value can control the if statement
		if(b)System.out.println("this is executed.");
		
		b = false;
		if(b) System.out.println("this is not executed.");
		
		//outcome of relational operator is boolean value
		System.out.print("10 > 9 is "+ (10>9) );
		
	}

}
