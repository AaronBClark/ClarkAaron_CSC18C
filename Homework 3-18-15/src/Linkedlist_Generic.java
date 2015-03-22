
public class Linkedlist_Generic {
	private Node head;
	private int listCount;
	
	public Linkedlist_Generic()
	{
		head = new Node(null);
		listCount = 0;
	}
	
	public void add(Object data)
	{
		Node listTemp = new Node(data);
		Node listCurrent = head;
		while(listCurrent.getNext() != null)
		{
			listCurrent = listCurrent.getNext();
		}
		listCurrent.setNext(listTemp);
		listCount++;
	}
	
	public void add(Object data, int index)
	{
		Node listTemp = new Node(data);
		Node listCurrent = head;
		for(int i = 1; i < index && listCurrent.getNext() != null; i++)
		{
			listCurrent = listCurrent.getNext();
		}
		listTemp.setNext(listCurrent.getNext());
		listCurrent.setNext(listTemp);
		listCount++;
	}
	
	public Object get(int index)
	{
		if(index <= 0)
			return null;
		Node listCurrent = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(listCurrent.getNext() == null)
				return null;
			listCurrent = listCurrent.getNext();
		}
		return listCurrent.getData();
	}
	
	public boolean remove(int index)
	{
		if(index < 1 || index > size())
			return false;
		Node listCurrent = head;
		for(int i = 1; i < index; i++)
		{
			if(listCurrent.getNext() == null)
				return false;
			listCurrent = listCurrent.getNext();
		}
		listCurrent.setNext(listCurrent.getNext().getNext());
		listCount--;
		return true;
	}
	
	public int size()
	{
		return listCount;
	}
	
	public String toString()
	{
		Node listCurrent = head.getNext();
		String output = "";
		while(listCurrent != null)
		{
			output += "[" + listCurrent.getData().toString() + "]\n";
			listCurrent = listCurrent.getNext();
		}
		return output;
	}
}
