/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        if(root.left==null&&root.right==null)
            return;
        else{
            if(root.right==null&&root.left!=null){
                TreeNode tn=new TreeNode(root.left.val);
                tn.left=root.left.left;
                tn.right=root.left.right;
                root.right=tn;
                root.left=null;
                invertBinaryTree(root.right);
            }
            else if(root.right!=null&&root.left==null){
                TreeNode tn=new TreeNode(root.right.val);
                tn.left=root.right.left;
                tn.right=root.right.right;
                root.left=tn;
                root.right=null;
                invertBinaryTree(root.left);
            }
            else{
                TreeNode tn = new TreeNode(root.left.val);
                tn.left=root.left.left;
                tn.right=root.left.right;
                root.left=root.right;
                root.right=tn;
                invertBinaryTree(root.left);
                invertBinaryTree(root.right);
            }
        }
    }
}
