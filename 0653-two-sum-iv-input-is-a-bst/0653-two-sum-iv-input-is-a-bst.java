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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        add(root,l);
        Collections.sort(l);
        int left=0,right=l.size()-1;
        while(left<right)
        {
            if((l.get(left)+l.get(right))==k)
            {
                return true;
            }
            if((l.get(left)+l.get(right))<k)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return false;
    }
    public void add(TreeNode root,List<Integer> l)
    {
        if(root==null)
        {
            return;
        }
        l.add(root.val);
        add(root.left,l);
        //l.add(root.val);
        add(root.right,l);
    }

}