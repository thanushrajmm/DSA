link -> [ https://leetcode.com/problems/binary-tree-preorder-traversal/ ] 
class Solution {
    ArrayList<Integer> v = new ArrayList<>();
        void calculate(TreeNode root){
        if(root != null){
            v.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        calculate(root);
        return v;
    }
}
