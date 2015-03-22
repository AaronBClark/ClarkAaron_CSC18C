
public class Stacks_2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[]args)
	{
		Stack_Generic stack1 = new Stack_Generic();
		Stack_Generic stack2 = new Stack_Generic();
		Stack_Generic stack3 = new Stack_Generic();
		
		Integer six = null;
		Generics Generic_six = null;
		
		for(int i = 0; i < 10; i++)
		{
			stack1.push(i);
			//Searchable objects
			if(i == 6)
			{
				six = new Integer(6);
				Generic_six = new Generics(i);
				stack2.push(six);
				stack3.push(Generic_six);
			}
			else
			{
				Integer num = new Integer(i);
				Generics temp = new Generics(i);
				stack2.push(num);
				stack3.push(temp);
			}
			
		}
		System.out.println("Primitive Int Stack:");
		stack1.displayStack();
		System.out.println("Searching for index containing 4...");
		int position1 = stack1.search(4);
		System.out.println("Index containing 4 is " + position1 + "\n");
		System.out.println("Peeking...");
		System.out.println("Found " + stack1.peek() + "\n");
		System.out.println("Popping two off...");
		stack1.pop();
		stack1.pop();
		System.out.println("Peeking again ...");
		System.out.println("Found " + stack1.peek() + "\n");
		
		
		System.out.println("Integer Wrapper Stack:");
		stack2.displayStack();
		System.out.println("Searching for index containing 6...");
		int position2 = stack2.search(six);
		System.out.println("Index containing 6 is " + position2 + "\n");
		System.out.println("Peeking...");
		System.out.println("Found " + stack2.peek() + "\n");
		System.out.println("Popping two off...");
		stack2.pop();
		stack2.pop();
		System.out.println("Peeking again ...");
		System.out.println("Found " + stack2.peek() + "\n");
		
		System.out.println("Generic Class Stack:");
		stack3.displayStack();
		System.out.println("Searching for index containing Generic_six...");
		int position3 = stack3.search(Generic_six);
		System.out.println("Index containing Generic_six is " + position3 + "\n");
		System.out.println("Peeking...");
		System.out.println("Found " + stack3.peek() + "\n");
		System.out.println("Popping two off...");
		stack3.pop();
		stack3.pop();
		System.out.println("Peeking again ...");
		System.out.println("Found " + stack3.peek() + "\n");
	}
}
