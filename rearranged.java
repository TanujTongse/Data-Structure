//Rearrange an array in maximum minimum form using Two Pointer Technique

import java.util.Scanner;
import java.util.*;
class Demo
{
    static void raarange(long ary[],int n)
    {
         long temp[]=new long[n];
         int small=0,large=n-1;
         boolean flag=true;
         for(int i=0;i<n;i++)
         {
            if(flag)
            {
               temp[i]=ary[large--];
            }
            else
            {
               temp[i]=ary[small++];
            }
            flag=!flag;
         }
         for(int i=0;i<n;i++)
         {
            ary[i]=temp[i];
         }
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n=s.nextInt();
        long ary[]=new long[n];
        System.out.println("Enter "+n+" Elements:-");
        for(int i=0;i<n;i++)
        {
            ary[i]=s.nextInt();
        }
        System.out.println("Elements are:-");
        for(int i=0;i<n;i++)
        {
            System.out.print(ary[i]+" ");
        }
        raarange(ary,n);
        System.out.println("\nRearranged Elements are:-");
        for(int i=0;i<n;i++)
        {
            System.out.print(ary[i]+" ");
        }
    }
}

//Time Complexity: O(N), Iterating over the array of size N 2 times.
//Auxiliary Space: O(N), since N extra space has been taken.