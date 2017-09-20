import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BinaryTreeTest {

    private final int[] preOrder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
    private final int[] midOrder = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
    private final int[] lastOrder = new int[]{7, 4, 2, 5, 8, 6, 3, 1};
    private final BinaryTree binaryTree = new BinaryTree();
    private ByteArrayOutputStream outputContent = new ByteArrayOutputStream();;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void shouldReconstructBinaryTreeWithPreAndMidOrder() throws Exception {
        BinaryTree.TreeNode treeNode = binaryTree.reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder);
        Assert.assertThat(treeNode.val, Is.is(1));

        Assert.assertThat(treeNode.left.val, Is.is(2));
        BinaryTree.TreeNode nodeValue4 = treeNode.left.left;
        Assert.assertThat(nodeValue4.val, Is.is(4));
        Assert.assertNull(nodeValue4.left);
        Assert.assertThat(nodeValue4.right.val, Is.is(7));

        Assert.assertThat(treeNode.right.val, Is.is(3));

        BinaryTree.TreeNode nodeVal5 = treeNode.right.left;
        Assert.assertThat(nodeVal5.val, Is.is(5));
        Assert.assertNull(nodeVal5.left);
        Assert.assertNull(nodeVal5.right);

        BinaryTree.TreeNode nodeVal6 = treeNode.right.right;
        Assert.assertThat(nodeVal6.val, Is.is(6));
        Assert.assertThat(nodeVal6.left.val, Is.is(8));
        Assert.assertNull(nodeVal6.right);
    }

    @Test
    public void shouldReconstructBinaryTreeWithLastAndMidOrder() throws Exception {
        BinaryTree.TreeNode treeNode = binaryTree.reconstructBinaryTreeWithLastAndMidOrder(lastOrder, midOrder);
        Assert.assertThat(treeNode.val, Is.is(1));

        Assert.assertThat(treeNode.left.val, Is.is(2));
        BinaryTree.TreeNode nodeValue4 = treeNode.left.left;
        Assert.assertThat(nodeValue4.val, Is.is(4));
        Assert.assertNull(nodeValue4.left);
        Assert.assertThat(nodeValue4.right.val, Is.is(7));

        Assert.assertThat(treeNode.right.val, Is.is(3));

        BinaryTree.TreeNode nodeVal5 = treeNode.right.left;
        Assert.assertThat(nodeVal5.val, Is.is(5));
        Assert.assertNull(nodeVal5.left);
        Assert.assertNull(nodeVal5.right);

        BinaryTree.TreeNode nodeVal6 = treeNode.right.right;
        Assert.assertThat(nodeVal6.val, Is.is(6));
        Assert.assertThat(nodeVal6.left.val, Is.is(8));
        Assert.assertNull(nodeVal6.right);
    }

    @Test
    public void shouldPrintBinaryValueInorder() throws Exception {
        BinaryTree.TreeNode treeNode = binaryTree.reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder);
        binaryTree.printBinaryTreeInorder(treeNode);
        Assert.assertThat(outputContent.toString(), Is.is("4 7 2 1 5 3 8 6 "));
    }

    @Test
    public void shouldPrintBinaryValuePreorder() throws Exception {
        BinaryTree.TreeNode treeNode = binaryTree.reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder);
        binaryTree.printBinaryTreePreorder(treeNode);
        Assert.assertThat(outputContent.toString(), Is.is("1 2 4 7 3 5 6 8 "));
    }

    @Test
    public void shouldPrintBinaryValueLastorder() throws Exception {
        BinaryTree.TreeNode treeNode = binaryTree.reconstructBinaryTreeWithPreAndMidOrder(preOrder, midOrder);
        binaryTree.printBinaryTreeLastorder(treeNode);
        Assert.assertThat(outputContent.toString(), Is.is("7 4 2 5 8 6 3 1 "));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
}
