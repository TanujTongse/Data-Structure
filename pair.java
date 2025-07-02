// Two Sum - Pair with given Sum

import java.util.Scanner;
class Demo
{
    static boolean pair(int ary[],int t)
    {
       int n=ary.length;
       for(int i=0;i<n;i++)
       {
          for(int j=i+1;j<n;j++)
          {
             if(ary[i]+ary[j]==t)
             {
                  return true;
             } 
          }
       }
       return false;
    }
    public static void main(String tt[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of array:-");
       int n=s.nextInt();
       int ary[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ary[i]=s.nextInt();
       }
       System.out.println("Enter the Target Value:-");
       int t=s.nextInt();
            if(pair(ary,t))
            { 
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
    }
}


//Time Complexity: O(n²), for using two nested loops
//Auxiliary Space: O(1)