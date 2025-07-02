//Maximum Subarray Sum - Kadane's Algorithm

import java.util.*;
class Demo
{
     static int maxsub(int ary[])
     {
         int res=ary[0];
         for(int i=0;i<ary.length;i++)
         {
            int c=0;
            for(int j=i;j<ary.length;j++)
            {
               c=c+ary[j];
               res=Math.max(res,c);
            }
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
        int a=maxsub(ary);
        System.out.println("Maximum Subarray is "+a);
     }
}

//Using Kadane's Algorithm - O(n) Time and O(1) Space