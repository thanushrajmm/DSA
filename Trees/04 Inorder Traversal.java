problem link -> [ https://leetcode.com/problems/binary-tree-inorder-traversal/ ] 
class Solution {
    ArrayList<Integer> v = new ArrayList<>();
        void calculate(TreeNode root){
        if(root != null){
            inorderTraversal(root.left);
            v.add(root.val);
            inorderTraversal(root.right);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        calculate(root);
        return v;
    }
}