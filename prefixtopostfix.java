
import java.util.Stack;
public class prefixtopostfix {
    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println(postfix(exp));
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
    
    static String postfix(String expression){

        Stack<String> stack = new Stack<String>();
        for (int i = expression.length()-1; i >=0 ; i--) 
        {

            char c = expression.charAt(i);

            if(precedence(c)>0)
            {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = s1 + s2 + c;
                stack.push(temp);
            }
            else
            {
                stack.push(c+"");
            }
        }

        String result = stack.pop();
        return result;
    }

    
}