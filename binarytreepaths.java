class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        helper(root,"",paths);
        return paths;

    }
    public void helper(TreeNode root,String path,List<String> paths){
        path+=root.val;//add the root to the path

        //we get a path if we reach the leaf
        if(root.left == null && root.right == null){
            paths.add(path);
            return;
        }
        if(root.left!=null){
            helper(root.left,path+ "->",paths);
        }
        if(root.right!=null){
            helper(root.right,path+"->",paths);
        }


        
    }
}
