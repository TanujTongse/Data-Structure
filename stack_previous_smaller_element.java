//Previous Smaller Element

import java.util.*;
import java.util.Stack;
class Tanuj
{
   static ArrayList<Integer> smaller(int ary[])
   {
       int n=ary.length;
       ArrayList<Integer> res=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
          res.add(-1);
       }
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++)
       {
          while(!st.isEmpty() && st.peek() >= ary[i])
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
      System.out.println("Previous Smaller Element is:");
      ArrayList<Integer> res=smaller(ary);
      for(int v:res)
      {
          System.out.print(v+" ");
      }
   }
}

//Using Monotonic stack - O(n) Time and O(n) Space