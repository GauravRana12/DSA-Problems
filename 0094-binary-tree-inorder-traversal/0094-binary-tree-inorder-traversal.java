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
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> values = new ArrayList<>();

        helper(values, root);

        return values;
    }

    public void helper(List<Integer> values, TreeNode root){

        if(root!= null){
            helper(values, root.left);
            values.add(root.val);
            helper(values, root.right);


        }
    }
}

