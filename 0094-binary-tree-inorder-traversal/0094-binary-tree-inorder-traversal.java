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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Result list to store inorder traversal
        List<Integer> ans = new ArrayList<Integer>();
        // Stack to simulate recursive function calls
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                // Push current node and move to its left child
                st.push(node);
                node = node.left;
            }
            else{
                // If no more nodes to process and stack is empty, traversal is done
                if(st.isEmpty()) break;
                // Process the node at the top of the stack
                node = st.pop();
                ans.add(node.val);// Move to the right child of the processed node
                node = node.right;
            }
        }
        return ans;
    }
 
}