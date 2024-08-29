import java.util.Scanner;
class Demo
{
    int pivot(int ary[],int n)
    {
        int s=0,e=n-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(ary[mid]>=ary[0])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }
        return s;
    }
    public static void main(String tt[])
    {
         Scanner s=new Scanner(System.in);
         Demo d=new Demo();
         System.out.println("Enter the size of array:-");
         int n=s.nextInt();
         int ary[]=new int[n];
         System.out.println("Enter "+n+" Elements:-");
         for(int i=0;i<n;i++)
         {
             ary[i]=s.nextInt();
         }
         System.out.println("Pivot is "+d.pivot(ary,n));
    }
}
//tc  o(logn)