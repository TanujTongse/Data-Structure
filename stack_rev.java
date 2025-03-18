import java.util.*;
class Demo
{
  static void the_helper(StringBuilder str)
  {
    Stack<Character> s = new Stack<>();
    for(int i=0;i<str.length();i++)
        s.push(str.charAt(i));
        str.delete(0, str.length());
    while(!s.empty())
    {
     str.append(s.peek());
     s.pop();
    }
  }
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String:-");
    String in=s.nextLine();
    StringBuilder str = new StringBuilder(in);
    the_helper(str);
    System.out.println("Reversed string is : " + str);
  }
}
