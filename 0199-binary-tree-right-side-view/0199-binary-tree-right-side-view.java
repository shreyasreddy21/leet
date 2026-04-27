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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        // while(root!=null)
        // {
        //     l.add(root.val);
        //     root=root.right;
        // }
        // return l;
        if(root==null)
        {
            return l;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode r=q.poll();
                if(i==s-1)
                {
                    l.add(r.val);
                }
                if(r.left!=null)
                {
                    q.offer(r.left);
                }
                if(r.right!=null)
                {
                    q.offer(r.right);
                }
            }
        }
        return l;
    }
}