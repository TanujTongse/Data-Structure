//Reverse Array in Groups

import java.util.*;
class Demo
{
    static void group(int ary[],int k,int n)
    {
        for(int i=0;i<n;i=i+k)
        {
            int left=i;
            int right=Math.min(i+k-1,n-1);
            while(left<right)
            {
                int t=ary[left];
                ary[left]=ary[right];
                ary[right]=t;
                left++;
                right--;
            }
        }  
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
       System.out.println("Enter Group size:-");
       int k=s.nextInt();
       group(ary,k,n);
       System.out.println("Reversing Group:-");
       for(int i=0;i<n;i++)
       {
           System.out.println(ary[i]);
       }
    }
}

/*

Time Complexity	-       O(n)
Space Complexity -	O(1)
*/
