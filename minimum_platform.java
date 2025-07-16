//Minimum Platforms


import java.util.*;
class Demo
{
    static int findplat(int arr[],int dep[],int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int need_plat=1,max_plat=1;
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
               need_plat++;
               i++;
            }
            else
            {
               need_plat--;
               j++;
            }
            max_plat=Math.max(max_plat,need_plat);
        }
        return max_plat;
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Arrival Time:-");
        int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	   arr[i]=s.nextInt();
	}
        System.out.println("Enter the Departure Time:-");
        int n1=s.nextInt();
	int dep[]=new int[n];
	for(int i=0;i<n1;i++)
	{
	   dep[i]=s.nextInt();
	}
        n=arr.length;
        int res=findplat(arr,dep,n);
        System.out.println("Minimum number of platforms required = " + res);
    }
}

/*
| Step             | Complexity     |
| ---------------- | -------------- |
| Sorting          | O(n log n)     |
| Two pointer walk | O(n)           |
| **Total**        | **O(n log n)** |
| Space            | O(1)           |

*/