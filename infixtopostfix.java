import java.util.Stack;
class Infixtopostfix{
   public static void main(String argr[])
   {
       String exp="a+b*(c^d-e)^(f+g*h)-i";
       System.out.println(infextopostfix(exp));
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
   static String infextopostfix(String exp)
    {
        String result=new String("");
        Stack <Character> stack=new Stack<>();
        int i=0;
        char c;
        for(i=0;i<exp.length();i++)
        {
            c=exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                result=result+c;
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    result=result+stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&precedence(c)<=precedence(stack.peek()))
                {
                    result=result+stack.pop();
                }
                stack.push(c);
                }
            }
        for(i=0;i<=stack.size();i++)
        {
            result=result+stack.pop();
        }
        return result;
    }

    
}public class infixtopostfix {
    
}