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
    List<TreeNode> result=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        for(int i=0;i<result.size()-1;i++){
            result.get(i).right=result.get(i+1);//
            result.get(i).left=null;
        }
         result.get(result.size()-1).right=null;//right of last element is null
         result.get(result.size()-1).left=null;//left of last element is null
        return result.get(0);//the first element of the arraylist is the head
    }
    public void inorder(TreeNode root){
       if(root==null)
           return;
       inorder(root.left);
       result.add(root);
       inorder(root.right);
          
          
            
            
        }
       
    }
