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
    public TreeNode help(int[] pre , int[] in, int inS, int inE, int preS, int preE){
        if(inS > inE){
            return null;
        }
        int rootData = pre[preS];
        TreeNode root = new TreeNode(rootData);
        int index = -1;  // index of root present at inorder array
        for(int i=inS; i<=inE; i++){
            if(in[i] == rootData){
                index = i;
                break;
            }
        }
        int leftIns = inS;
        int leftInE = index -1;
        int leftPres = preS+1;
        int leftPreE = leftPres + leftInE - leftIns ;
        int rightIns = index + 1 ;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;

        root.left = help(pre , in, leftIns, leftInE, leftPres, leftPreE);
        root.right = help(pre, in, rightIns, rightInE, rightPreS, rightPreE);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder, inorder, 0, inorder.length-1, 0, preorder.length-1);
    }
}