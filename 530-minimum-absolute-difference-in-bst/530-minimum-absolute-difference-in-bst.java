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
    List<Integer> res = new ArrayList();
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<res.size()-1;i++){
            min=Math.min(min,Math.abs(res.get(i+1)-res.get(i)));
        }
       return min; 
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
    
}