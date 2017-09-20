public class BinaryTree {
    public TreeNode reconstructBinaryTreeWithPreAndMidOrder(int[] preOrder, int[] midOrder) {
        if(IsEmptyOrder(preOrder, midOrder)){
            return null;
        }

        return reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder, 0, preOrder.length -1, 0, midOrder.length - 1);
    }

    private TreeNode reconstructBinaryTreeWithPreAndMidOrder(int[] preOrder, int[] midOrder, int preStartIndex, int preEndIndex,
                                                             int midStartIndex, int midEndIndex) {
        if(preStartIndex > preEndIndex || midStartIndex > midEndIndex){
            return null;
        }

        TreeNode rootNode = new TreeNode(preOrder[preStartIndex]);
        for (int i = midStartIndex; i <= midEndIndex; i++) {
            if(midOrder[i] == preOrder[preStartIndex]){
                int offset = i - midStartIndex;

                rootNode.left = reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder, preStartIndex + 1,
                        preStartIndex + offset, midStartIndex, i - 1);
                rootNode.right = reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder, preStartIndex + 1 + offset,
                        preEndIndex, i + 1, midEndIndex);
            }
        }

        return rootNode;
    }

    public TreeNode reconstructBinaryTreeWithLastAndMidOrder(int[] lastOrder, int[] midOrder) {
        if (IsEmptyOrder(lastOrder, midOrder)) return null;

        return reconstructBinaryTreeWithLastAndMidOrder(lastOrder, midOrder, 0, lastOrder.length - 1,
                0, midOrder.length - 1);
    }

    private TreeNode reconstructBinaryTreeWithLastAndMidOrder(int[] lastOrder, int[] midOrder, int lastStartIndex,
                                                              int lastEndIndex, int midStartIndex, int midEndIndex) {
        if(lastStartIndex > lastEndIndex || midStartIndex > midEndIndex){
            return null;
        }
        TreeNode rootNode = new TreeNode(lastOrder[lastEndIndex]);
        for (int i = midStartIndex; i <= midEndIndex; i++) {
            if(midOrder[i] == lastOrder[lastEndIndex]){
                int offset = i - midStartIndex;
                rootNode.left = reconstructBinaryTreeWithLastAndMidOrder(lastOrder, midOrder,
                        lastStartIndex, lastStartIndex + offset - 1, midStartIndex, i - 1);
                rootNode.right = reconstructBinaryTreeWithLastAndMidOrder(lastOrder, midOrder,
                        lastStartIndex + offset, lastEndIndex - 1, i + 1,
                        midEndIndex);
            }
        }
        return rootNode;
    }

    private boolean IsEmptyOrder(int[] firstOrder, int[] midOrder) {
        return firstOrder == null || firstOrder.length < 1 || midOrder == null || midOrder.length < 1
                || firstOrder.length != midOrder.length ;
    }

    public void printBinaryTreeInorder(TreeNode treeNode) {
        if(treeNode != null){
            printBinaryTreeInorder(treeNode.left);
            System.out.print(treeNode.val + " ");
            printBinaryTreeInorder(treeNode.right);
        }
    }

    public void printBinaryTreePreorder(TreeNode treeNode) {
        if(treeNode != null){
            System.out.print(treeNode.val + " ");
            printBinaryTreePreorder(treeNode.left);
            printBinaryTreePreorder(treeNode.right);
        }
    }

    public void printBinaryTreeLastorder(TreeNode treeNode) {
        if(treeNode != null){
            printBinaryTreeLastorder(treeNode.left);
            printBinaryTreeLastorder(treeNode.right);
            System.out.print(treeNode.val + " ");
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
