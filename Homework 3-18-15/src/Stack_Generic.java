
public class Stack_Generic{
	Linkedlist_Generic list = new Linkedlist_Generic();
	
	public void push(Object data)
	{
		list.add(data);
	}
	
	public void pop()
	{
		if(list.size() > 0)
			list.remove(list.size());
	}
	
	public void displayStack()
	{
		System.out.println(list.toString());
	}
	
	public boolean empty()
	{
		if(list.size() > 0)
			return true;
		else
			return false;
	}
	
	public <E> Object peek()
	{
		return list.get(list.size());
	}
	
	public int search(Object o)
	{
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i) == o)
			{
				return i;
			}
		}
		return -1;
	}
}
