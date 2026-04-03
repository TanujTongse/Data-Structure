//Maximum Depth or Height of a Binary Tree

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
   static int height(Tree root)
   {
      if(root==null)
      {
         return -1;
      }
      int lheight=height(root.left);
      int rheight=height(root.right);
      return Math.max(lheight,rheight)+1;
   }
   public static void main(String tt[])
   {
      Tree root=new Tree(1);
      root.right=new Tree(2);
      root.left=new Tree(3);
      root.right.left=new Tree(4);
      root.left.right=new Tree(5);
      System.out.println("Maximum Depth or Height of a Binary Tree:");
      System.out.println(height(root));
   }
}

/*
   Using Recursion
   Time Complexity: O(n)
Space Complexity: O(n), Recursive stack space
*/