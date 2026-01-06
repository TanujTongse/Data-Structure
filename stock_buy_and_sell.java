// Stock Buy and Sell - Max one Transaction Allowed

import java.util.Scanner;
class Demo
{
    static int maxprofit(int prices[])
    {
        int n=prices.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
           {
              res=Math.max(res,prices[j]-prices[i]);
           }
        }
        return res;
    }
    public static void main(String tt[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the prices:-");
       int n=s.nextInt();
       int prices[]=new int[n];
       for(int i=0;i<n;i++)
       {
           prices[i]=s.nextInt();
       }
       System.out.println("Max Profit is:-"+maxprofit(prices));
    }
}


//Time Complexity: O(n^2)
//Auxiliary Space: O(1)


| Day | Price `p` | `min_price` | `profit` = p - min\_price | `max_profit` |
| --- | --------- | ----------- | ------------------------- | ------------ |
| 0   | 7         | 7           | 7-7=0                     | 0            |
| 1   | 10        | 7           | 10-7=3                    | 3            |
| 2   | 1         | min(7,1)=1  | 1-1=0                     | 3            |
| 3   | 3         | 1           | 3-1=2                     | 3            |
| 4   | 6         | 1           | 6-1=5                     | 5            |
| 5   | 9         | 1           | 9-1=8                     | 8            |
| 6   | 2         | 1           | 2-1=1                     | 8            |

output -> 8
