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
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    private ArrayList<Integer> al = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return al;
        al.add(root.val);            
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return al;
    }
}
