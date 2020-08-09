import java.util.*;
public class stacks_two {
    public static void main(String args[])
    {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack(n);
        s.push(10);
        s.push1(90);
        s.push(47);
        s.push(23);
        s.push1(50);
        System.out.print(s.pop()+"element pops from stack1\n");
        System.out.print(s.pop1()+"element pops from stack2");
        sc.close();
    }
}
class Stacks{
    int top,top1;
    int max,max1;
    int a[];
    Stacks(int n)
    {
        a=new int[n];
        top=-1;
        top1=n/2-1;
        max=n/2;
        max1=n;
    }
    void push(int d)
    {
        if(top>=max-1)
        {
            System.out.println("Stack1 overflow");
        }
        else{
            a[++top]=d;
            System.out.println("element added in stack1");
        }
    }
    void push1(int d)
    {
        if(top1>=max1-1)
        {
            System.out.println("Stack2 overflow");
        }
        else{
            a[++top1]=d;
            System.out.println("element added in stack2");
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack1 underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    }
    int pop1()
    {
        if(top1==max-1)
        {
            System.out.println("Stack2 underflow");
            return 0;
        }
        else{
            return a[top1--];
        }
    }
}