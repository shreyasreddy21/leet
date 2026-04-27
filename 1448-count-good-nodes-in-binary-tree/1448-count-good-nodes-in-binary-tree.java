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
    public int goodNodes(TreeNode root) {
        return count(root,root.val);
    }
    public int count(TreeNode root,int v)
    {
        if(root==null)
        {
            return 0;
        }
        int c=0;
        if(root.val>=v)
        {
            c+=1;
        }
        v=Math.max(v,root.val);
        c+=count(root.left,v);
        c+=count(root.right,v);
        return c;
    }
}