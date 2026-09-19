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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        calcLength(root);

        return maxDiameter;
    }

    public int calcLength(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = calcLength(node.left);
        int right = calcLength(node.right);

        maxDiameter = Math.max(maxDiameter, left + right);

        return 1 + Math.max(left, right);

    }
}
