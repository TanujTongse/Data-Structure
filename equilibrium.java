// Equilibrium index of an array

import java.util.Scanner;
class Demo
{
    static int equal(int ary[],int n)
    {
        int leftsum,rightsum;
        for(int i=0;i<n;i++)
        {
            leftsum=0;
            for(int j=0;j<i;j++)
            {
                leftsum+=ary[j];
            }
            rightsum=0;
            for(int j=i+1;j<n;j++)
            {
                rightsum+=ary[j];
            }
            if(leftsum==rightsum)
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
        System.out.println(equal(ary,n));
        
    }
}