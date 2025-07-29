public class Problem2 {
    //Q) Maximum Depth of Binary Tree
    //Given the root of a binary tree, return its maximum depth.
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
