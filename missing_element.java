//Missing in Array
//Using Hashing - O(n) Time and O(n) Space

import java.util.Scanner;
import java.util.*;
class Demo
{
   static int missElement(int ary[])
   {
        int n=ary.length+1;
        for(int i=1;i<=n;i++)
        {
            boolean f=false;
            for(int j=0;j<n-1;j++)
            {
               if(ary[j]==i)
               {
                   f=true;
                   break;
               }
            }
            if(!f)
            return i;
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
       System.out.println("Missing Element is "+missElement(ary));
   }
}