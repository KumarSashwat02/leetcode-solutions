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
    ArrayList<Integer> ans = new ArrayList<>();
    public void tree(TreeNode root){
        if(root == null){
            return;
        }
        tree(root.left);
        ans.add(root.val);
        tree(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        tree(root);
        return ans;
    }
}