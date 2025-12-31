//Move all Zeros to End of Array

import java.util.*;
class Tanuj
{
    static void pushZero(int ary[])
    {
        int n=ary.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(ary[i]!=0)
            {
                temp[j++]=ary[i];
            }
        }
        while(j<n)
        {
            temp[j++]=0;
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
        int ary[]=new int[n];
        System.out.println("Enter "+n+" Elements:-");
        for(int i=0;i<n;i++)
        {
           ary[i]=s.nextInt();
        }
        System.out.println("Move All Zero's To End Of Array:-");
        pushZero(ary);
        for(int num:ary)
        {
            System.out.println(num);
        }
    }
}

//[Naive Approach] Using Temporary Array - O(n) Time and O(n) Space