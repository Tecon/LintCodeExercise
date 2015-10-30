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
     * @return: Inorder in ArrayList which contains node values.
     */
    private ArrayList<Integer> al = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return al;
        inorderTraversal(root.left);
        al.add(root.val);
        inorderTraversal(root.right);
        return al;
    }
}
