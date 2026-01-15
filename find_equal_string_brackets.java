//Find an equal point in a string of brackets

import java.util.*;
class Tanuj
{
   static int findpoint(String s)
   {
      int n=s.length();
      for(int i=0;i<n;i++)
      {
         int opencnt=0,closecnt=0;
         for(int j=0;j<i;j++)
         {
            if(s.charAt(j)=='(')
            {
               opencnt++;
            }
         }
         for(int j=i;j<n;j++)
         {
            if(s.charAt(j)==')')
            {
               closecnt++;
            } 
         } 
         if(opencnt==closecnt)
         {
            return i;
         }
      }
      return -1;
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String:-");
      String s1=s.nextLine();
      System.out.println("Equal Point is "+findpoint(s1));
   }
}

//Using Nested Loops – O(n^2) Time and O(1) Space