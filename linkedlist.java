
public class linkedlist {
    Node head=null;
    public static void main(String args[])
    {
        linkedlist l=new linkedlist();
        l=insert(7,l);
        l=insert(70,l);
        l=insert(700,l);
        print(l);
    }
    public static linkedlist insert(int data,linkedlist l)
    {
        Node newNode= new Node(data);
        if(l.head==null)
        {
            l.head=newNode;
        }
        else{
            Node temp=l.head;
            {
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
        }
        return(l);
    }
    public static void print(linkedlist l)
    {
        Node current=l.head;
        System.out.println("Linked List is");
        while(current!=null)
        {
            System.out.println(current.data);
			current=current.next;
        }
    }
    static class Node{
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }

    }

}