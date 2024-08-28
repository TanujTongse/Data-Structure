import java.util.Scanner;
class Demo
{
     int binary(int ary[],int n,int k)
     {
          int s=0,e=n-1;
          while(s<=e)
          {
              int mid=s+(e-s)/2;
              if(ary[mid]==k)
              {
                  return mid;
              }
              else if(ary[mid]<k)
              {
                   s=mid+1;
              }
              else
              {
                   e=mid-1;
              }
          }
          return -1;
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
         System.out.println("Enter the key:-");
         int k=s.nextInt();
         int i=d.binary(ary,n,k);
         if(i!=-1)
         {
            System.out.println("Element is present");
         }
         else
         {
            System.out.println("Element is not present");
         }
     }
}