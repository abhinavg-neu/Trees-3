/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Time Complexity: O(N)
    // Space Complexity: O(H)
    boolean isSymmetric = true;
    public boolean isSymmetric(TreeNode root) {
       if (root == null){
        return true;
       }
       dfs (root.left, root.right);
       return isSymmetric;
    }
   public void dfs (TreeNode left, TreeNode right){
    if (left == null && right == null)
    return;
    if (left == null || right == null){
        isSymmetric = false;
    return;
    }
    if (left.val != right.val){
        isSymmetric = false;
        return;
    }
        dfs(left.left, right.right);
        dfs(left.right, right.left);
   } 
}