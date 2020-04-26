public class week01_144 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            LinkedList<Integer> output = new LinkedList<>();

            TreeNode node = root;
            while (node != null) {
                if (node.left == null) {
                    output.add(node.val);
                    node = node.right;
                }
                else {
                    TreeNode predecessor = node.left;
                    while ((predecessor.right != null) && (predecessor.right != node)) {
                        predecessor = predecessor.right;
                    }

                    if (predecessor.right == null) {
                        output.add(node.val);
                        predecessor.right = node;
                        node = node.left;
                    }
                    else{
                        predecessor.right = null;
                        node = node.right;
                    }
                }
            }
            return output;


        }
    }
}
