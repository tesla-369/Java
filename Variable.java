
public class Variable { //keeping class public is optional
	
	int a = 10; //instance variable
	static double b= 20.5;//static variable because we are using static keyword
	//Static variables are used to keep track of information that relates logically to an entire class, as opposed to information that varies from instance to instance.  
	public static void main(String args[]) { //main function
		
		boolean c = true;//local variable
		//We need class object to access instance variable a, without class object we can't access it
		//System.out.println(a); //can't use this
		Variable s = new Variable();//Variable is class name and s is object of class Variable
		System.out.println(s.a);
		System.out.println(b);//Object is not required for instance and local variable
		System.out.println(c);
				
	}
	
}
