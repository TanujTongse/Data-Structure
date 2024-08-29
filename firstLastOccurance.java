import java.util.Scanner;
class Demo
{
    int foc(int ary[],int n,int k)
    {
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(ary[mid]==k)
            {
                ans=mid;
                e=mid-1;
            }
            else if(k>ary[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    int loc(int ary[],int n,int k)
    {
       int s=0,e=n-1;
       int ans=-1;
       while(s<=e) 
       {
           int mid=s+(e-s)/2;
           if(ary[mid]==k)
           {
               ans=mid;
               s=mid+1;
           }
           else if(k>ary[mid])
           {
               s=mid+1;
           }
           else
           {
               e=mid-1;
           }
       }
       return ans;
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
         System.out.println("Enter the Key if you want to search:-");
         int k=s.nextInt();
         int f=d.foc(ary,n,k);
         int l=d.loc(ary,n,k);
         System.out.println("First Occurance of "+k+" is "+f);
         System.out.println("Last Occurance of "+k+" is "+l);

         //Total Occurance

         int oc=0;
         for(int i=0;i<n;i++)
         {
            if(ary[i]==k)
            {
                oc++;
            }
         }
         System.out.println("Total Occurance "+oc);
    }
}

/*
Time Complexity: 
O(n) (due to input reading), and the searching operations themselves are 𝑂(log𝑛)
O(logn).
Space Complexity: 
O(n) for the input array, and 𝑂(1)
O(1) for additional variables.
*/