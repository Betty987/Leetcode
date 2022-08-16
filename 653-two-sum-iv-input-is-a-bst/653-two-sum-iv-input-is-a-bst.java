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
    List<Integer> res= new ArrayList();
    HashMap<Integer,Integer> map = new HashMap();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        
        for(int i=0;i<res.size();i++){
            int complement=k-res.get(i);
            if(map.containsKey(complement)) return true;
            map.put(res.get(i),i);
        }
        return false;
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}