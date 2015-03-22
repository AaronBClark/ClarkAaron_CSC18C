import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Integer[] numbers = new Integer[15];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = new Integer(i);
		Character[] chars = { 'p', 'r', 'o', 'g', 'a', 'r', 'm', 'm', 'i',
				'n', 'g' };
		Stack<Integer> stack1 = new Stack<Integer>(); 
		Stack<Character> stack2 = new Stack<Character>();
		new Stacks(chars, stack2); //changeable Generic and Stacks
		System.out.println("\nOriginal");
		Stacks.displayStack(stack2); 
		for (int i = 0; i < 7; i++) {
			stack2.pop();
		}
		System.out.println("\nAfter Removal");
		Stacks.displayStack(stack2);
		stackPush(stack2, chars, 5);
		stackPush(stack2, chars, 4);
		System.out.println("\nAfter Swapping Elements");
		Stacks.displayStack(stack2);
		System.out.println("\nAfter Reconstructing");
			for (int i = 6; i < chars.length; i++) {
				stackPush(stack2, chars, i);
		}
		Stacks.displayStack(stack2);
	}
	public static <E> void displayStack(Stack<E> s) {
		System.out.println(s);
	}
	public static <E> void stackPush(Stack<E> stack, E[] array, int num)
	{
		if(stack.size() == array.length)
		{
			int size = array.length + 1;
			@SuppressWarnings("unchecked")
			E[] newArray = (E[])new Object[size];
			for(int i = 0; i < size-1; i++)
				newArray[i] = array[i];
			array = newArray;
		}
		stack.push(array[num]);
	}
	public <E> Stacks(E[] e, Stack<E> stack)
	{
		Stack<E> s = stack;
		for (int i = 0; i < e.length; i++)
			stackPush(s, e, i);
	}
}