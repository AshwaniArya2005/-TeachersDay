class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//Q) Same Tree
//Given the roots of two binary trees p and q, write a function to check if they are the same or not.

public class Problem2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p != null && q == null) || (p == null && q != null)){
            return false;
        }
        if(p == null && q == null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}