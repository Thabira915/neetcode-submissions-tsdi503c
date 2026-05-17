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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHigh = maxHieght(root.left);
        int rightHigh = maxHieght(root.right);

        int diameter = leftHigh + rightHigh;

        int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
         
        return Math.max(diameter, sub); 
    }

    public int maxHieght(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxHieght(root.left), maxHieght(root.right));
    }
}
