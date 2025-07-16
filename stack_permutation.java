import java.util.*;
class Demo
{
    static int c=0;
    static void permutation(String str,String res)
    {
        if(str.length()==0)
        {
            c++;
            System.out.println(res);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String ren=str.substring(0,i)+str.substring(i+1);
            permutation(ren,res+ch);
        }
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:-");
        String str=s.nextLine();
        System.out.println("Permutations:-");
        permutation(str," ");
        System.out.println("Total Permutations:-"+c);
    }
}