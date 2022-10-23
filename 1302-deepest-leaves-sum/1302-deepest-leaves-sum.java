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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int levelsum=0;
        while(!queue.isEmpty()){
            levelsum=0;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode currentnode = queue.poll();
                levelsum+=currentnode.val;
                if(currentnode.left!=null) queue.offer(currentnode.left);
                if(currentnode.right!=null) queue.offer(currentnode.right);
            }
        }
        return levelsum;
    }
}