import java.util.Stack;
class Demo
{
    static boolean isbalance(String s)
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[')
            {
                st.push(currentChar);
            }
            else 
            {
                if (!st.empty() && 
                    ((st.peek() == '(' && currentChar == ')') ||
                     (st.peek() == '{' && currentChar == '}') ||
                     (st.peek() == '[' && currentChar == ']')))
                    {
                    st.pop();
                    }
               else 
               {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args)
    {
        String s = "{([])}";
        if (isbalance(s))
        {
            System.out.println("True");  
        } else 
        {
            System.out.println("False");
        }
    }
}
