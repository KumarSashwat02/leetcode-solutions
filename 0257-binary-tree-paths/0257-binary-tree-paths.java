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
    public static void path(TreeNode root, String s, List<String> ans){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            s += String.valueOf(root.val);
            ans.add(s);
            return;
        }
        s = s + String.valueOf(root.val)+"->";
        path(root.left, s, ans);
        path(root.right, s, ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String s = "";
        path(root, s , ans);
        return ans;
    }
}