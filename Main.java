import java.util.Stack;

public class Main {
	
	public static void main(String args[]) {
		
		//stack = LIFO data structure.Last-In First-Out
		//		  Stores objects into  a sort of "vertical tower"
		//		  push() to add to the top
		//		  pop() to remove from the top
		
		 Stack<String> stack = new Stack<String>();
		 
		 		 
		 stack.push("Minecraft");
		 stack.push("GTAV");
		 stack.push("POng");
		 stack.push("Doom");
		 stack.push("FFVII");
		 
		// stack.pop();
		//stack.pop();
		//System.out.println(stack.empty());
		System.out.println(stack);
		 
		 String myFavGame = stack.pop();
		 
		 System.out.println(myFavGame);
		
	}

}
