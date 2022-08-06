/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode target,res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target=target;
        inorder(original,cloned);
        return res;
        
    }
    public void inorder(TreeNode original,TreeNode cloned){
        if(original!=null){
            inorder(original.left,cloned.left);
            if(original==target) res=cloned;
            inorder(original.right,cloned.right);
        }
    }
}