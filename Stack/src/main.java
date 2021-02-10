public class main {
    public static class TreeNode<T> {
        public T data;
        public TreeNode left, right;

        public TreeNode(T val) {
            this.data = val;
            this.left = this.right = null;
        }
    }
    public static class Tree {

        TreeNode first;

        void lineByLine() throws Exception {
            Queue<TreeNode> q = new Queue<TreeNode>();
            q.push(first);
            for (int i=1; ;i++ ) {
                if (q.size == 0)
                    break;
                int n = q.size;
                System.out.print("Уровень "+ i +": ");
                while (n > 0) {
                    TreeNode treeNode = q.pop();
                    System.out.print(treeNode.data + " ");
                    if (treeNode.left != null) {
                        q.push(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        q.push(treeNode.right);
                    }
                    n--;
                }
                System.out.println();
            }
        }
    }

    public static void  main(String[] args) throws Exception {
        Tree tree = new Tree();
        tree.first = new TreeNode(10);
        tree.first.left = new TreeNode(4);
        tree.first.right = new TreeNode(1);
        tree.first.left.right = new TreeNode(5);
        tree.first.left.right.right = new TreeNode(5);
        tree.lineByLine();

    }
}
