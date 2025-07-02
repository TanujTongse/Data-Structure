//Compare Version Of Numbers

import java.util.Scanner;
import java.util.*;
class Demo
{
    static int conversionver(String v1,String v2)
    {
         String ver1[]=v1.split("\\.");
         String ver2[]=v2.split("\\.");
         int len=Math.max(ver1.length,ver2.length);
         for(int i=0;i<len;i++)
         {
             int n1=i<ver1.length?Integer.parseInt(ver1[i]):0;
             int n2=i<ver2.length?Integer.parseInt(ver2[i]):0;
             if(n1<n2)return -1;
             if(n1>n2)return 1;
         }
         return 0;
    }
    public static void main(String tt[])
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the First Version:-");
         String v1=s.nextLine();
         System.out.println("Enter the Second Version:-");
         String v2=s.nextLine();
         int result=conversionver(v1,v2);
         if(result==-1)
         {
             System.out.println(v1+" is smaller then "+v2);
         }
         else if(result==1)
         {
             System.out.println(v1+" is greater then "+v2);
         }
         else
         {
             System.out.println(v1+" is equal "+v2);
         }
    }
}