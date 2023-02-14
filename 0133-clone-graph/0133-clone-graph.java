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
    public Node cloneGraph(Node node) 
    {
        if(node==null) return null;
        HashMap<Node,Node> hm=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        hm.put(node, new Node(node.val));
        while(!q.isEmpty())
        {
            Node cur=q.poll();
            for(Node it : cur.neighbors)
            {
                if(!hm.containsKey(it))
                {
                    hm.put(it,new Node(it.val));
                    q.add(it);
                }
                hm.get(cur).neighbors.add(hm.get(it));
            }
        }
        return hm.get(node);
    }
}