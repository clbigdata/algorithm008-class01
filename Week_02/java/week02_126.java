public class week02_126 {
    // This code is a modified version of the code posted by
// #zzzliu on the discussion forums.


        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    level.add(node.val);
                    queue.addAll(node.children);
                }
                result.add(level);
            }
            return result;
        }

}
