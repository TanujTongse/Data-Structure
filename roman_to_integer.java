import java.util.*;
class Demo
{
    static int roman(String s)
    {
        HashMap<Character, Integer> hash=new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);

        int res=0;
        for(int i=0;i<s.length();i++)
        {
             if(i+1 < s.length() && hash.get(s.charAt(i)) < hash.get(s.charAt(i+1)))
             {
                res+=hash.get(s.charAt(i+1))-hash.get(s.charAt(i));
                i++;
             }
             else
             {
                res+=hash.get(s.charAt(i));
             }
        } 
             return res;
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:-");
        String str=s.nextLine();
        System.out.println(roman(str));
    }
}