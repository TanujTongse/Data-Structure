//Symmetric Tree

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
   static boolean same(Tree leftsub,Tree rightsub)
   {
      if(leftsub==null && rightsub==null)
      {
          return true;
      }
      if(leftsub==null || rightsub==null || leftsub.data!=rightsub.data)
      {
          return false;
      }
      return same(leftsub.left,rightsub.right) && same(leftsub.right,rightsub.left);
   }
   static boolean symmatric(Tree root)
   {
      if(root==null)
      {
         return true;
      }
      return same(root.left,root.right);
   }
   public static void main(String tt[])
   {
      Tree r=new Tree(1);
      r.left=new Tree(2);
      r.right=new Tree(2);
      r.right.left=new Tree(3);
      r.left.right=new Tree(3);
      System.out.println("Symmetric Tree is:-");
      System.out.println(symmatric(r)?"True":"False");
   }
}

/*
Time Complexity: O(n)
Auxiliary Space: O(h), where h is height of binary tree due to recursive stack space
*/