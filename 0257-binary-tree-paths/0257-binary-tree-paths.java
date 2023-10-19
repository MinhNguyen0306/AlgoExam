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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        if(root != null) backtrack(path, "", root);
        return path;
    }
    
    void backtrack(List<String> path, String node, TreeNode root) {
        if(root.left != null) backtrack(path, node + root.val+ "->", root.left);
        if(root.right != null) backtrack(path, node + root.val + "->", root.right);
        if(root.left == null && root.right == null) path.add(node + root.val);
    }
}