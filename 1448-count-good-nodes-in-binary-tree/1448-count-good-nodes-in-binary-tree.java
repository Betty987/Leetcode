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
    //time=O(n)
    //space=O(height)
    
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        return helper(root,Integer.MIN_VALUE);
        
    }
    private int helper(TreeNode root,int max){
        if(root==null) return 0;
        int res=(root.val<max)?0:1;
        max=Math.max(max,root.val);
        return res+helper(root.left,max)+helper(root.right,max);
    }
    
}