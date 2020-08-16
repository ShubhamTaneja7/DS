import java.util.Stack;
public class EvaluaatePostfix {
    public static void main(String args[])
    {
        String exp="53+62/*35*+";
        System.out.println(ans(exp));
    }
    static int ans(String exp)
    {
        int i;
        Stack <Integer> stack=new Stack<>();
        for(i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }
            else{
               int a=stack.pop();
                int b=stack.pop();
                if(c=='*')
                {
                    stack.push(b*a);
                }
                else if(c=='/')
                {
                    stack.push(b/a);
                }
                else if(c=='+')
                {
                    stack.push(b+a);
                }
                else if(c=='-')
                {
                    stack.push(b-a);
                }
                else if(c=='^')
                {
                    stack.push(b^a);
                }
            }
        }
        return stack.pop();
    }
}


