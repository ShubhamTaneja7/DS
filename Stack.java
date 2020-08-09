public class Stack{
    static int top=-1;
    static final int max=90;
    static int a[]=new int[max];
    static void push(int d){
        if(top>=max-1)
        {
            System.out.println("stack overflow");
        }
        else{
            a[++top]=d;
            System.out.println("element added");
        }
    }
    static int pop()
    {
        if(top==-1)
        {
            System.out.println("stack undeflow");
            return 0;
        }
        else{
            System.out.println("element removed");
            return a[top--];
            
        }
    }
    public static void main(String args[])
    {
        push(1);
        push(2);
        push(3);
        push(4);
        pop();
        pop();
        push(5);
    }
}