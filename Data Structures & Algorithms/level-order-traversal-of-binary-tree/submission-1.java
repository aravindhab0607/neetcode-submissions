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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();

        if( root == null ){
            return output;
        }
        Queue<TreeNode> queue =  new LinkedList<>();

        queue.offer(root);
        //output.add(new ArrayList<>(Arrays.asList(root.val)));
        while( !queue.isEmpty() ){
            //TreeNode currentNode = queue.poll();
            List<Integer> currentLevelNodes = new ArrayList<Integer>();

            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node != null) {
                    currentLevelNodes.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (currentLevelNodes.size() > 0) {
                output.add(currentLevelNodes);
            }
        }
        return output;
    }
}
