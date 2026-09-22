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
    public int goodNodes(TreeNode root) {

        return isGoodNode(root, root.val);
        
         
    }

    public int isGoodNode(TreeNode node, int maxValue) {
        if (node == null) {
            return 0;
        }
        int nodePoints = 0;
        if (node.val >= maxValue) {
            nodePoints = 1;
            maxValue = node.val;
        }

        int rightGoodNodes = isGoodNode(node.right, maxValue);
        int leftGoodNodes = isGoodNode(node.left, maxValue);

        return nodePoints + rightGoodNodes + leftGoodNodes;
    }
}
