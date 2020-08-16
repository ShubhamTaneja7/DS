import java.util.Stack;
public class Infixtoprefix {
    public static void main(String args[])
    {
        String  expression="A+B*(C^D-E)";
        System.out.println(infixtopostfixx(expression));
    }
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static StringBuilder infixtopostfixx(String expression1)
    {
        StringBuilder result=new StringBuilder();
        StringBuilder   expression=new StringBuilder(expression1);
        Stack<Character> stack=new Stack<>();
        expression.reverse();
        char [] c1 = new String(expression).toCharArray();
        for(int i=0;i<expression.length();i++)
        {
            if(c1[i]=='(')
            {
                c1[i]=')';
            }
            else if(c1[i]==')')
            {
                c1[i]='(';
            }
        }
        for(int i=0;i<expression.length();i++)
        {
           char c=c1[i];
           if(precedence(c)>0)
           {
                while(!stack.isEmpty() && precedence(stack.peek())>=precedence(c))
                {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
            else if(c==')')
            {
                char x = stack.pop();
                while(x!='(')
                {
                    result.append(x);
                    x = stack.pop();
                }
            }
        else if(c=='('){
            stack.push(c);
        }else{
            result.append(c);
        }
        }
        
        for(int i=0;i<=stack.size();i++)
        {
            result.append(stack.pop());
        }
        return result.reverse();
    }
}