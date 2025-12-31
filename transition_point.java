//Transition point in a binary array

import java.util.*;
class Demo
{
   static int transitionpoint(int ary[])
   {
       int n=ary.length;
       for(int i=0;i<n;i++)
       {
          if(ary[i]==1)
          {
             return i;
          }
       }
       return -1;
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
       System.out.println("Transition Points:-");
       System.out.println(transitionpoint(ary));
   }
}

//[Naive Approach] Using a for Loop - O(n) Time and O(1) Space