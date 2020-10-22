package bst;

/**
 * This lists out the operations that this binary search tree is allowed to do.
 * We represent the type of data that this will work with as a generic parameter T.
 * This is a placeholder for the actual data type.
 *
 * @param <T> the type of element in the tree.
 */
public interface BST<T extends Comparable> {
  /**
   * Inserts an object into the tree.  If that object is already present, nothing is done.
   *
   * @param obj The object to be inserted.
   */
  void add(T obj);

  /**
   * Returns the number of elements in the tree.
   *
   * @return The size of the tree.
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
   * THis will search and return the smallest object in the tree.
   *
   * @return The smallest object.
   */
  T minimum();

  /**
   * This will search and return the largest object in the tree.
   *
   * @return The largest object.
   */
  T maximum();

  /**
   * Process the current node and then traverse left and then traverse right.
   *
   * @return  return a string with the data in the node in the order of processing,
   *     one on each line.
   */
  String preOrder();

  /**
   * Traverse left then process the current node and then traverse right.
   *
   * @return  return a string with the data in the node in the order of processing,
   *     one on each line.
   */
  String inOrder();

  /**
   * Traverse left then traverse right and then process the current node.
   *
   * @return  return a string with the data in the node in the order of processing,
   *      one on each line.
   */
  String postOrder();

  /**
   * This computes the height of the subtree.
   *
   * @return The height of the subtree.
   */
  int height();
}
