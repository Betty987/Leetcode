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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
             setnode(root,preorder[i]);
        }
       
        return root;
        
    }
    void setnode(TreeNode root,int val){
        if(val>root.val){//we have to put it on the right
            if(root.right==null){
                root.right=new TreeNode(val);
            }
            else{
                setnode(root.right,val);
            }
            
            
        }
        else{//we have to put it on the left
            if(root.left==null){
                root.left=new TreeNode(val);
            }
            else{
                setnode(root.left,val);
            } 
        }
    }
}