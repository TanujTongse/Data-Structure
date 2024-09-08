//Factorial of a Number
/*
import java.util.Scanner;
class Demo
{
    int fact(int n)
    {
         if(n==0)
         {
            return 0;
         }
         else if(n==1)
         {
            return 1;
         }
         else
         {
            return n*fact(n-1);
         }
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        Demo d=new Demo();
        System.out.println("Enter a Number:-");
        int n=s.nextInt();
        System.out.println("Factorial of "+n+" is "+d.fact(n));
    }
}
*/
// Time Complexity :  O(n)


// Fibonacii Series
import java.util.Scanner;
class Demo
{
    int fibo(int n)
    {
         if(n==0)
         {
            return 0;
         }
         else if(n==1)
         {
            return 1;
         }
         else
         {
            return fibo(n-1)+fibo(n-2);
         }
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        Demo d=new Demo();
        System.out.println("Enter a Number:-");
        int n=s.nextInt();
        System.out.println("Fibonacii Series:-");
        System.out.println(d.fibo(n));
    }
}
