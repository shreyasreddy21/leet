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
    public boolean isBalanced(TreeNode root) {
        int x=height(root);
        if(x!=-1)
        {
            return true;
        }
        return false;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int h=Math.abs(left-right);
        if(left==-1||right==-1||h>1)
        {
            return -1;
        }
        return Math.max(left,right)+1;
    }
}