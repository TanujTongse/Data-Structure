//Postfix to Prefix Conversion

import java.util.*;
import java.util.Stack;
class Tanuj
{
    static boolean isOperator(char v)
    {
      switch(v)
      {
        case '+':
        case '-':
        case '*':
        case '/':
            return true;
      }
      return false; 
    }
    static String posttopre(String post)
    {
        Stack<String> s=new Stack<>();
        int n=post.length();
        for(int i=0;i<n;i++)
        {
           if(isOperator(post.charAt(i)))
           {
              String o1=s.peek();
              s.pop();
              String o2=s.peek();
              s.pop();
              String t=post.charAt(i)+o2+o1;
              s.push(t);
           }
           else
           {
              s.push(post.charAt(i)+"");
           }
        }
        String ans="";
        for(String i:s)
        {
           ans=ans+i;
        }
        return ans;
    }
    public static void main(String tt[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Postfix Expression:-");
       String s1=s.nextLine(); 
       System.out.println("Prefix is:");
       System.out.println(posttopre(s1));
    }
}

/*
Time Complexity: O(N)
(We traverse the expression once, each operation is constant time.)
Auxiliary Space: O(N)
(Stack stores up to N elements in the worst case.)
*/