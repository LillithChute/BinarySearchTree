package bst;

import static java.lang.Math.max;

import java.util.List;

/**
 * This represents the group node.  A group node signals that there are further nodes that can
 * be explored.
 *
 * @param <T> the type of element in the tree.
 */
class BSTGroupNode<T extends Comparable<T>> implements BSTNode<T> {
  private BSTNode<T> left;
  private BSTNode<T> right;
  private final T data;

  /**
   * This creates an instance of a group node.
   *
   * @param left The left child node.
   * @param right The right child node.
   * @param data The data being passed into the tree to create the node.
   */
  public BSTGroupNode(T data, BSTNode<T> left, BSTNode<T> right) {
    this.left = left;
    this.right = right;
    this.data = data;
  }

  public int size() {
    return 1 + left.size() + right.size();
  }

  @Override
  public boolean present(T obj) {
    if (this.data.compareTo(obj) == 0) {
      return true;
    }

    return obj.compareTo(this.data) < 0 ? left.present(obj) : right.present(obj);
  }

  @Override
  public T minimum() {
    // If there is no left minimum then this is a leaf.
    return this.left.toString() == null ? this.data : this.left.minimum();
  }

  @Override
  public T maximum() {
    // If there is no right maximum then this is a leaf.
    return this.right.toString() == null ? this.data : this.right.maximum();
  }

  @Override
  public BSTNode<T> add(T obj) {
    if (this.data.compareTo(obj) < 0) {
      right = right.add(obj);
    } else if (this.data.compareTo(obj) > 0) {
      left = left.add(obj);
    }

    return this;
  }

  @Override
  public List<T> preOrder(List<T> nodeList) {

    nodeList.add(this.data);
    this.left.preOrder(nodeList);
    this.right.preOrder(nodeList);

    return nodeList;
  }

  @Override
  public List<T> inOrder(List<T> nodeList) {

    this.left.inOrder(nodeList);
    nodeList.add(this.data);
    this.right.inOrder(nodeList);

    return nodeList;
  }

  @Override
  public List<T> postOrder(List<T> nodeList) {

    this.left.postOrder(nodeList);
    this.right.postOrder(nodeList);
    nodeList.add(this.data);

    return nodeList;
  }

  @Override
  public int height() {

    if (this.data == null) {
      return -1;
    }

    return 1 + max(this.left.height(), this.right.height());
  }

  @Override
  public String toString() {
    return "Group Node";
  }
}
