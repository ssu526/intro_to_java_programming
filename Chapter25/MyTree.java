public interface MyTree<E> extends Iterable<E>{
	public boolean search(E: e);
	public boolean insert(E: e);
	public boolean delete(E: e);
	public void inorder();
	public void preorder();
	public void postorder();
	public  int getSize();
	public boolean isEmpty();
	public void clear();

	/** 25.1 Displays the nodes in a breadth-first traversal */
	public void breadthFirstTraversal();
	/** 25.1 Returns the height of this binary tree */
	public int height();

	/** Returns true if the tree is a full binary tree */
	public boolean isFullBST()


	/** Returns the number of leaf nodes */
	public int getNumberOfLeaves()

	/** Returns the number of nonleaf nodes */
	public int getNumberofNonLeaves()


	public void inorderNonRecursive();
	public void preorderNonRecursive();
	public void postorderNonRecursive();
	public java.util.Iterator<E> bidirectionalInterator();

}