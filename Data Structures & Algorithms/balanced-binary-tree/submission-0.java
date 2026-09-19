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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        calcLength(root);
        return balanced;
        
    }

    public int calcLength(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = calcLength(node.left);
        int right = calcLength(node.right);

        int diff = Math.abs(left - right);
        if (diff > 1) {
            balanced = false;
        }

        return 1 + Math.max(left, right);
    }
}
