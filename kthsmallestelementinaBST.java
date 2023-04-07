class Solution {
    public int count=0,ans=-1;
    public int kthSmallest(TreeNode root, int k) {
      inorder(root,k);
      return ans;

    }

    public void inorder(TreeNode node,int k){
        if(node.left!=null) inorder(node.left,k);
    
    count++;
    if(count==k) {
      ans=node.val; 
      return; 
    }
     if(node.right!=null) inorder(node.right,k);

    } 
}
