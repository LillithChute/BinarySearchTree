import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import bst.BST;
import bst.BSTImpl;

import org.junit.Before;
import org.junit.Test;

/**
 * This tests the implementation of the Binary Search Tree.
 */
public class BSTTest {

  private BST<Integer> bst;
  private BST<Integer> bstOne;
  private BST<Integer> bstEmpty;

  @Before
  public void setup() {
    bstEmpty = new BSTImpl<>();

    bst = new BSTImpl<>();
    bst.add(6);
    bst.add(4);
    bst.add(8);
    bst.add(3);
    bst.add(5);
    bst.add(7);
    bst.add(9);

    bstOne = new BSTImpl<>();
    bstOne.add(6);
    bstOne.add(4);
    bstOne.add(8);
    bstOne.add(11);
    bstOne.add(3);
    bstOne.add(5);
    bstOne.add(2);
    bstOne.add(7);
    bstOne.add(9);
  }

  /**
   * Checks the tree values to make sure it's built.
   */
  @Test
  public void testConstructor() {
    assertEquals("[3 4 5 6 7 8 9]", bst.toString());
  }

  @Test
  public void testSize() {
    assertEquals(0, bstEmpty.size());
    assertEquals(7, bst.size());
    assertEquals(9, bstOne.size());
  }

  /**
   * Check to see that we can add values and the count matches
   */
  @Test
  public void testAdd() {
    BST<Integer> bstAdd = new BSTImpl<>();
    bstAdd.add(6);
    assertEquals(1, bstAdd.size());

    bstAdd.add(7);
    bstAdd.add(8);
    assertEquals(3, bstAdd.size());
  }

  /**
   * Checks to make sure that no duplicates are allowed.
   */
  @Test
  public void testAddExistingValue() {
    // This tree is of size 7.
    bst.add(6);
    assertEquals(7, bst.size());
  }

  /**
   * Is the item in question in the tree.
   */
  @Test
  public void testPresentTrue() {
    assertTrue(bst.present(8));
    assertTrue(bst.present(7));
    assertTrue(bst.present(5));
  }

  /**
   * Is the item in question NOT in the tree.
   */
  @Test
  public void testPresentFalse() {
    assertFalse(bst.present(2));
    assertFalse(bst.present(1));
    assertFalse(bst.present(100));
  }

  /**
   * What is the maximum item in the tree.
   */
  @Test
  public void testMaximum() {
    assertEquals(java.util.Optional.of(9), java.util.Optional.of(bst.maximum()));
    assertEquals(java.util.Optional.of(11), java.util.Optional.of(bstOne.maximum()));
    assertNull(bstEmpty.maximum());
  }

  /**
   * An empty tree should return null.
   */
  @Test
  public void testMaximumEmptyTree() {
    assertNull(bstEmpty.maximum());
  }

  /**
   * What is the minimum item in the tree.
   */
  @Test
  public void testMinimum() {
    assertEquals(java.util.Optional.of(3), java.util.Optional.of(bst.minimum()));
    assertEquals(java.util.Optional.of(2), java.util.Optional.of(bstOne.minimum()));
  }

  /**
   * An empty tree should return null.
   */
  @Test
  public void testMinimumEmptyTree() {
    assertNull(bstEmpty.minimum());
  }

  /**
   * The max branch length of the tree.
   */
  @Test
  public void testHeight() {
    assertEquals(java.util.Optional.of(3), java.util.Optional.of(bst.height()));
    assertEquals(java.util.Optional.of(4), java.util.Optional.of(bstOne.height()));
  }

  /**
   * Should return null.
   */
  @Test
  public void testHeightEmptyTree() {
    assertEquals(java.util.Optional.of(0), java.util.Optional.of(bstEmpty.height()));
  }

  /**
   * Left, node value, right in that order.
   */
  @Test
  public void testInOrder() {
    assertEquals("[3 4 5 6 7 8 9]", bst.inOrder());
    assertEquals("[2 3 4 5 6 7 8 9 11]", bstOne.inOrder());
    assertNull(bstEmpty.inOrder());
  }

  /**
   * Node value, left, right.
   */
  @Test
  public void testPreOrder() {
    assertEquals("[6 4 3 5 8 7 9]", bst.preOrder());
    assertEquals("[6 4 3 2 5 8 7 11 9]", bstOne.preOrder());
    assertNull(bstEmpty.preOrder());
  }

  /**
   * Left, right, then node value.
   */
  @Test
  public void testPostOrder() {
    assertEquals("[3 5 4 7 9 8 6]", bst.postOrder());
    assertEquals("[2 3 5 4 7 9 11 8 6]", bstOne.postOrder());
    assertNull(bstEmpty.postOrder());
  }
}