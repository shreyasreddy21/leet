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
    public List<TreeNode> generateTrees(int n) {
        // if(n==0)
        // {
        //     return new ArrayList<>();
        // }
        return tree(1,n);
    }
    public List<TreeNode> tree(int start,int end)
    {
        List<TreeNode> l=new ArrayList<>();
        if(start>end)
        {
            l.add(null);
            return l;
        }
        for(int i=start;i<=end;i++)
        {
            List<TreeNode> leftT=tree(start,i-1);
            List<TreeNode> rightT=tree(i+1,end);
            for(TreeNode left:leftT)
            {
                for(TreeNode right:rightT)
                {
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    l.add(root);
                }
            }
        }
        return l;
    }
}