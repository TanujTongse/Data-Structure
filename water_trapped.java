//Trapping Rain Water


import java.util.*;
class Demo
{
    static int watertrap(int height[])
    {
        int res=0;
        for(int i=0;i<height.length-1;i++)
        {
             int left=height[i];
             for(int j=0;j<i;j++)
                left=Math.max(left,height[j]);
 
             int right=height[i];
             for(int j=i+1;j<height.length;j++)
                right=Math.max(right,height[j]);

             res+=Math.min(left,right)-height[i];
        }
             return res;
    }
    public static void main(String tt[])
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Size of array:-");
         int n=s.nextInt();
         int ary[]=new int[n];
         System.out.println("Enter "+n+" Elements:-");
         for(int i=0;i<n;i++)
         {
            ary[i]=s.nextInt();
         }
         System.out.println("Trapping Water "+watertrap(ary));
    }
}

/*
Time Complexity = O(n²)
Space Complexity = O(1)

*/