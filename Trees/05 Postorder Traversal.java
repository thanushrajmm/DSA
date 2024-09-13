link -> [ https://leetcode.com/problems/binary-tree-postorder-traversal/ ] 
class Solution {
    ArrayList<Integer> v = new ArrayList<>();
        void calculate(TreeNode root){
        if(root != null){
            calculate(root.left);
            calculate(root.right);
            v.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        calculate(root);
        return v;
    }
}
