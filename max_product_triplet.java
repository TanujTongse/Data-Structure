import java.util.*;
class Demo
{
   static int maxtriplet(int ary[])
   {
       int n=ary.length;

       // MIN_VALUE=find simply Maximum value;
       // MAX_VALUE=find simply Minimum Value;

       int maxproduct=Integer.MIN_VALUE;  
       for(int i=0;i<n-2;i++)
       {
          for(int j=i+1;j<n-1;j++)
          {
             for(int k=j+1;k<n;k++)
             {
                maxproduct=Math.max(maxproduct,ary[i]*ary[j]*ary[k]);
             }
          }
       }
       return maxproduct;
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
       System.out.println("Maximum Product Of Triplet is:-");
       System.out.println(maxtriplet(ary));
   }
}
//Time Complexity O(n^3)