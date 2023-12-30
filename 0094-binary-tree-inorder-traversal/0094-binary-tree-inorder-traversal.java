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
        ArrayList<Integer> arr=new ArrayList<>();
        
        Stack<TreeNode> st=new Stack<TreeNode>();
        TreeNode curr=root;
        while(curr!=null || !st.empty()){
            while(curr!=null){
                st.add(curr);
                curr=curr.left;
            }
          curr=st.pop();
           arr.add(curr.val);
            curr=curr.right;
        }
        return arr;
    }
}

