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
    LinkedList<Integer> ll = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null)
        {
            return ll;
        }
        inorderTraversal(root.left);
        ll.add(root.val);
        inorderTraversal(root.right);
        return ll;
    }
}
