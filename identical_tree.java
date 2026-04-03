//Check if Two Trees are Identical


import java.util.*;
class Tree
{
   int data;
   Tree left,right;
   Tree(int v)
   {
       data=v;
       left=null;
       right=null;
   }
}
class Tanuj
{
   static boolean identical(Tree r1,Tree r2)
   {
       if(r1==null && r2==null)
       {
          return true;
       }
       if(r1==null || r2==null)
       {
          return false;
       }
       return(r1.data==r2.data) && identical(r1.left,r2.left) && identical(r1.right,r2.right);
   }
   public static void main(String tt[])
   {
      Tree r1=new Tree(1);
      r1.right=new Tree(2);
      r1.left=new Tree(3);
      r1.right.left=new Tree(4);
      r1.left.right=new Tree(5);

      Tree r2=new Tree(1);
      r2.right=new Tree(2);
      r2.left=new Tree(3);
      r2.right.left=new Tree(4);
      r2.left.right=new Tree(5);
 
      System.out.println(identical(r1,r2)?"True":"False");
   }
}

/*
Using Recursion (DFS)
Time Complexity: O(n), where n is the number of nodes in the larger of the two trees, as each node is visited once.
Auxiliary Space: O(h), where h is the height of the trees, due to the recursive call stack.
*/

