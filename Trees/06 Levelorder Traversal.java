link -> [https://leetcode.com/problems/binary-tree-level-order-traversal/] 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null ) return wrapList;

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i = 0; i<levelNum; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            wrapList.add(sublist);
        }
        return wrapList;
    }
}
