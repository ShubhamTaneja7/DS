public class circular_queue {
    static int  size=5;
    static int front=-1,rear=-1;
    static int queue[]=new int[size];
    public static void main(String args[])
    {
        enqueue(56);
        enqueue(48);
        enqueue(93);
        dequeue();
        dequeue();
        enqueue(2);
        System.out.println("The queue is:");
        display();
    }
    static void enqueue(int n)
    {
        if((rear==size-1&&front==1)||(rear==front-1))
        {
            System.out.println("queue overflow");
        }
        else if(rear==size-1&&front!=1)
        {
            rear=0;
            queue[rear]=n;
        }
       else if (front==-1&&rear==-1)
        {
            front++;
            queue[++rear]=n;
            System.out.println(n +" added to queue");
        }
        else{
            queue[++rear]=n;
            System.out.println(n +" added to queue");
        }
    }
    static int dequeue()
    {
        if((front==-1&&rear==-1))
        {
            System.out.println("queue underflow");
            return 0;
        }
        else{
            System.out.println("front"+front+" elsemet="+queue[front]);
            int n=queue[front];
            if(front==rear)
            {
                front=-1;
            }
            else if(front==size-1)
            {
                front=0;
            }
            else{
                front++;
            }
           System.out.println(n +"deleted from queue");
            return n;
        }
    }
    static void display()
    {
        if(rear>front)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(queue[i]);
            }
        }
        else
        {
            for(int i=front;i<size;i++)
            {
                System.out.println(queue[i]);
            }
            for(int i=0;i<=rear;i++)
            {
                System.out.println(queue[i]);
            }
        }
    }
}