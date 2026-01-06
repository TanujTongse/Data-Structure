import java.util.*;
class Tanuj
{
    static void wave(int ary[])
    {
       int n=ary.length;
       for(int i=0;i<n-1;i=i+2)
       {
          int temp=ary[i];
          ary[i]=ary[i+1];
          ary[i+1]=temp;
       }
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
       System.out.println("Sort Array in Wave Form:-");
       wave(ary);
       for(int w:ary)
       {
          System.out.println(w);
       }
    }
}