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
    List<Integer> anslist=new ArrayList();
    HashMap<Integer,Integer> map = new HashMap();
    public int[] findMode(TreeNode root) {
       
        inorder(root);
        for(int i=0;i<res.size();i++){
            map.put(res.get(i),map.getOrDefault(res.get(i),0)+1);
        }
        
        int max=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==max){
                anslist.add(entry.getKey());
            }
        }
        int[] ansarr=new int[anslist.size()];
        for(int i=0;i<anslist.size();i++){
            ansarr[i]=anslist.get(i);
        }
        return ansarr;
    }
      
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
        
    }
}