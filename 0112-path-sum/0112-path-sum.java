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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        if(root==null) return false;
        return checking(root,targetSum,sum);
    }
    public static boolean checking(TreeNode root,int t,int sum){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            sum+=root.val;
            if(sum==t) return true;
        }
        return checking(root.right,t,sum+root.val) || checking(root.left,t,sum+root.val);
    }
}