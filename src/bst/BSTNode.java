package bst;

import java.util.List;

/**
 * This lists out the internal operations that this binary tree is allowed to do.
 *
 * @param <T> the type of element in the tree.
 */
interface BSTNode<T extends Comparable<T>> {

  /**
   * This method adds an element to the tree.
   *
   * @param obj The object to be added to the tree.
   * @return A new node containing the element.
   */
  BSTNode<T> add(T obj);

  /**
   * Returns the number of nodes in the tree.
   *
   * @return The number of nodes.
   */
  int size();

  /**
   * Checks to see if the passed in object already exists in the tree.
   *
   * @param obj The object that is being compared.
   * @return True if that object exists in the tree.
   */
  boolean present(T obj);

  /**
   * This gets the minimum value contained in the tree.  Essentially this means traversing the
   * left nodes in a row.
   *
   * @return The minimum value.
   */
  T minimum();

  /**
   * This gets the maximum value contained in the tree.  Essentially this means traversing the
   * right nodes in a row.
   *
   * @return The maximum value.
   */
  T maximum();

  /**
   * This returns the values of the tree in a pre-order traversal.
   *
   * @param nodeList A list containing the elements of the tree.
   * @return A list sorted in a pre-order traversal.
   */
  List<T> preOrder(List<T> nodeList);

  /**
   * This returns the values of the tree in a in-order traversal.
   *
   * @param nodeList A list containing the elements of the tree.
   * @return A list sorted in a in-order traversal.
   */
  List<T> inOrder(List<T> nodeList);

  /**
   * This returns the values of the tree in a post-order traversal.
   *
   * @param nodeList A list containing the elements of the tree.
   * @return A list sorted in a post-order traversal.
   */
  List<T> postOrder(List<T> nodeList);

  /**
   * This returns the length of the longest branch of the tree.
   *
   * @return The length of the longest branch of the tree.
   */
  int height();
}
