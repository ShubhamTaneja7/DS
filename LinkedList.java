public class LinkedList 
{
	Node head=null;
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
		list = insert(list, 6); 
		printlist(list);
	}
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node=new Node(data);
		//student s=new student('abc');
		//s.rollno.
		//s.class
		new_node.next=null;
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			{
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=new_node;
			}
		}
		return (list);
	}
	public static void printlist(LinkedList list)
	{
		Node current=list.head;
		System.out.println("Linked list:");
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	static class Node
	{
		//Data Members
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}

	}
} 


















