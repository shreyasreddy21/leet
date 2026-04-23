/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
        {
            return null;
        }
        Map<Node,Node> m=new HashMap<>();
        return dfs(node,m);
    }
    public Node dfs(Node node,Map<Node,Node> m)
    {
        if(m.containsKey(node))
        {
            return m.get(node);
        }
        Node c=new Node(node.val);
        m.put(node,c);
        for(Node n:node.neighbors)
        {
            c.neighbors.add(dfs(n,m));
        }
        return c;
    }
}