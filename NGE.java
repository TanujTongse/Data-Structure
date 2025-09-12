//Next Greater Element

import java.util.ArrayList;
import Java.util.Stack
import java.util.*;
class Demo
{
   static ArrayList<Integer> large(int ary[])
   {
      int n=ary.length;
      ArrayList<Integer> res=new ArrayList<>();
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<n;i++)
      {
          res.add(-1);
      }
      for(int i=n-1;i>=0;i--)
      {
          while(!st.isEmpty() && st.peek() <=ary[i])
          {
             st.pop();
          }
          if(!st.isEmpty())
          {
             res.set(i,st.peek());
          }
          st.push(ary[i]);
      }
          return res;
   }
   public static void main(String tt[])
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of array:-");
       int n=s.nextInt();
       int ary[]=new int[n];
       System.out.println("Enter "+n+" Elements:-");
       for(int i=0;i<n;i++)
       {
          ary[i]=s.nextInt();
       }
       System.out.println("Elements are:-");
       ArrayList<Integer> res=large(ary);
       for(int t:res)
       {
           System.out.println(t);
       }
   }
}

/*
Time Compexity O(n)
*/