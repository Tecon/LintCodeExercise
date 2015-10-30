import java.util.ArrayList;

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
     * @return: Postorder in ArrayList which contains node values.
     */
    private ArrayList<Integer> l = new ArrayList<Integer>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return l;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        return l;
    }
}
