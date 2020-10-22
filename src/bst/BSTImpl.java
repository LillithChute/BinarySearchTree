package bst;

import java.util.LinkedList;
import java.util.List;

/**
 * This is a concrete implementation of a Binary Search Tree.  A binary tree
 * is a recursive data structure where each node can have 2 children at most.
 *
 * @param <T> the type of element in the tree.
 */
public class BSTImpl<T extends Comparable<T>> implements BST<T> {

  private BSTNode<T> root;
  private final List<T> orderedList = new LinkedList<>();

  public BSTImpl() {
    root = new BSTLeafNode<>();
  }

  @Override
  public void add(T obj) {
    root = root.add(obj);
  }

  @Override
  public int size() {
    return root.size();
  }

  @Override
  public boolean present(T obj) {
    return root.present(obj);
  }

  @Override
  public T minimum() {
    return root.minimum();
  }

  @Override
  public T maximum() {
    return root.maximum();
  }

  @Override
  public String preOrder() {
    // Serialize.
    return formatTraversalList(root.preOrder(orderedList));
  }

  @Override
  public String inOrder() {
    // Serialize.
    return formatTraversalList(root.inOrder(orderedList));
  }

  @Override
  public String postOrder() {
    // Serialize.
    return formatTraversalList(root.postOrder(orderedList));
  }

  @Override
  public int height() {
    return root.height();
  }

  @Override
  public String toString() {
    // In the event of a null tree
    if (root == null) {
      return "Empty";
    }

    return formatTraversalList(root.inOrder(orderedList));
  }

  /**
   * This takes a list of sorted values held in the BST and formats them into a string.
   *
   * @param nodeTraversalList A list of values sorted by how the tree was traversed.
   * @return A string representation of the element values of the list.
   */
  private String formatTraversalList(List<T> nodeTraversalList) {
    // Check for an empty tree
    if (nodeTraversalList == null) {
      return null;
    }

    StringBuilder listOfNodes = new StringBuilder();

    listOfNodes.append("[");

    for (T t : nodeTraversalList) {
      listOfNodes.append(t).append(" ");
    }

    return listOfNodes.toString().trim() + "]";
  }
}
