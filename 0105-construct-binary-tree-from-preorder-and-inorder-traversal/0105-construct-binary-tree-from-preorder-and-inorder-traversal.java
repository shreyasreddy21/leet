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
    int idx=0;
    Map<Integer,Integer> m=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<preorder.length;i++)
        {
            m.put(inorder[i],i);
        }
        return tree(preorder,0,inorder.length-1);
    }
    public TreeNode tree(int[] p,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int r=p[idx++];
        TreeNode root=new TreeNode(r);
        int mid=m.get(r);
        root.left=tree(p,start,mid-1);
        root.right=tree(p,mid+1,end);
        return root;
    }
}