# Binary Search Tree
The goal of this lab is to design and implement a linked-tree structure that uses a union data type.

Define and implement the the interface BST for a binary search tree that contains the following methods:

* public void add(T obj) : insert an object in the tree. If the object is already present in the tree, does nothing.

* public int size() : return the size of this tree (i.e. the number of elements in this tree).

* public boolean present(T obj) : returns true if this object is present in the tree, false otherwise.

* public T minimum() : returns the smallest object (defined by the ordering) in the tree, and null if the tree is empty.

* public T maximum() : returns the largest object (defined by the ordering) in the tree, and null if the tree is empty.
Override toString to return a String of the form [ 1 2 3 ] where 1, 2, and 3 are the elements of the tree, in ascending order.
Write three methods -- preOrder, inOrder, postOrder -- that traverse the tree in the three orders described above. Each of them should return a string with the data in the node in the order in which they process them, one on each line (i.e. "process node" means creating and returning a string-representation of the data in the node).

* Write a method height that will compute and return the height of the the subtree.

Similar to lists, most binary search tree operations exploit the recursive nature of binary search trees. The binary search tree property helps us to argue how each operation in a tree can be defined as corresponding to similar operations on subtrees. Try to formulate insertion and membership operations as recursive operations on a tree.

Write an implement BSTImpl for the above interface. Similar to lists, you should implement node classes for the tree and implement the functionality in terms of node operations. This class should also have a constructor that creates an empty tree.
