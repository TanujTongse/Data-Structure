//Remove duplicates from Sorted Array

/*
import java.util.Scanner;
import java.util.Arrays;

class Demo
{
    public static void main(String tt[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = s.nextInt();
        int[] ary = new int[n];
        System.out.println("Enter " + n + " Elements:-");
        for (int i = 0; i < n; i++)
        {
            ary[i] = s.nextInt();
        }

        // Sort the array to bring duplicates together
        Arrays.sort(ary);

        // Print the unique elements
        System.out.println("Unique Elements:");
        if (n > 0)
        {
            System.out.print(ary[0]); // Print the first element
        }

        for (int i = 1; i < n; i++)
        {
            if (ary[i] != ary[i - 1]) 
            {
                // Check if current element is different from the previous one
                System.out.print(" " + ary[i]);
            }
        }

        s.close();
    }
}
*/

//Approach 2:

import java.util.*;
class Demo
{
    static int removedupli(int ary[])
    {
        HashSet<Integer> s=new HashSet<>();
        int idx=0;
        int n=ary.length;
        for(int i=0;i<n;i++)
        {
           if(!s.contains(ary[i]))
           {
              s.add(ary[i]);
              ary[idx++]=ary[i];
           }
        }
        return idx;
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
       System.out.println("After Removeing Duplicat Element:-");
       int a=removedupli(ary);
       for(int i=0;i<a;i++)
       {
          System.out.print(ary[i]+" ");
       }
    }
}

//Works for Unsorted Also - O(n) Time and O(n) Space
