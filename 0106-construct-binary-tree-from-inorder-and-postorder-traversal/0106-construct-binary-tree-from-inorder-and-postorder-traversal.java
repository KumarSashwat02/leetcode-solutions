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
    public TreeNode help(int[] in, int[] post, int inS, int inE, int postS, int postE){
        if(inS > inE || postS > postE){
            return null;
        }
        int rootData = post[postE];
        TreeNode root = new TreeNode(rootData);
        int index = -1;    // index of rootData in inorder array
        for(int i=inS; i<=inE; i++){
            if(in[i] == rootData){
                index = i;
                break;
            }
        }

        int leftIns = inS; 
        int leftInE = index-1;
        int leftPostS = postS;
        int leftPostE = leftPostS + leftInE - leftIns;
        int rightIns = index+1;
        int rightInE = inE;
        int rightPostS = leftPostE + 1; 
        int rightPostE = postE - 1;

        root.left = help(in, post, leftIns, leftInE, leftPostS, leftPostE);
        root.right = help(in, post, rightIns, rightInE, rightPostS, rightPostE);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return help(inorder, postorder, 0, inorder.length-1, 0 , postorder.length-1);
    }
}