package bst;

import java.util.List;

/**
 * This class represents a leaf node of this tree.  It is needed to signal the end of a branch.
 *
 * @param <T> the type of element in the tree.
 */
class BSTLeafNode<T extends Comparable<T>> implements BSTNode<T> {
  private final T data;

  BSTLeafNode() {
    this.data = null;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean present(T obj) {
    return false;
  }

  @Override
  public T minimum() {
    return this.data;
  }

  @Override
  public T maximum() {
    return this.data;
  }

  @Override
  public BSTNode<T> add(T obj) {
    return new BSTGroupNode<>(obj, this, this);
  }

  @Override
  public List<T> preOrder(List<T> nodeList) {
    return null;
  }

  @Override
  public List<T> inOrder(List<T> nodeList) {
    return null;
  }

  @Override
  public List<T> postOrder(List<T> nodeList) {
    return null;
  }

  @Override
  public int height() {
    return 0;
  }

  @Override
  public String toString() {
    return null;
  }
}
