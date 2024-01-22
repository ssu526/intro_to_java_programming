public class MyBST<E extends Comparable<E>> extends MyAbstractTree<E>{
	private TreeNode<E> root;
	private int size=0;

	public MyBST(){

	}

	public MyBST(E[] objects){
		for(E e:objects){
			insert(e);
		}
	}

	@Override
	public boolean search(E e){
		TreeNode<E> current = root;

		while(current!=null){
			if(current.element.compareTo(e)<0){
				current=current.left;
			}else if(current.element.compareTo(e)>0){
				current=current.right;
			}else{
				return true;
			}
		}

		return false;
	}


	@Override
	public boolean insert(E e){
		TreeNode<E> current = root;
		TreeNode<E> parent = null;

		if(size==0){
			root=new TreeNode(e);
			return true;
		}else{
			while(current!=null){
				if(current.element.compareTo(e)<0){
					parent=current;
					current=current.left;
				}else if(current.element.compareTo(e)>0){
					parent = current;
					current=current.right;
				}else{
					System.out.println("Cannot insert duplicate value");
					return false;
				}

			}

			if(e.compareTo(parent.element)<0){
				parent.left=e;
			}else{
				parent.right=e;
			}

			size++;
			return true;
		}
	}



	@Override
	public boolean delete(E e){

		TreeNode<E> current = root;
		TreeNode<E> parent = null;

		while(current != null){
			if(e.compareTo(current.element)<0){
				parent=current
				current=current.left;
			}else if(e.compareTo(current.element)>0){
				parent=current
				current=current.right;
			}else{
				break;
			}
		}

		if(current=null){
			return false;
		}

		if(current.left==null){
			if(parent==null){
				root=current.right;
			}else{
				if(current.element.compareTo(parent.element)<0){
					parent.left=current.right;
				}else{
					current.right=current.right;
				}
			}
		}else{
			TreeNode<E> rightMost = current.left;
			TreeNode<E> parentRightMost=current;

			while(rightMost.right != null){
				parent=rightMost;
				rightMost=rightMost.right;
			}

			current.element=rightMost.element;

			if(parentRightMost.right=rightMost){
				parentRightMost.right=rightMost.left;
			}else{
				parentRightMost.left = rightMost.left;
			}

		}

		size--;
		return true;
	}


	@Override
	public void inorder(){
		inorder(root);
	}


	public void inorder(TreeNode<E> root){
		if(root==null) return;

		inorder(root.left);
		System.out.print(root.element+" ");
		inorder(root.right);
	}


	public void inorderNonRecursive(){
		Stack<E> stack = new Stack<>();
		if(root!=null) stack.push(root);

		while(!stack.isEmpty()){
			Treenode<E> temp = stack.pop()

			if(temp.right==null && temp.left==null){  //if the node is a leaf
				System.out.print(temp);   //print the node
				if(!stack.isempty()) System.out.print(stack.pop()); //print it's parent

			}else if(temp.left==null && temp.right != null){  //if the node only has right child
				System.out.print(temp);  //print parent
				stack.push(temp.right);  //add right child to the stack

			}else if(temp.left != null && temp.right == null){  //if the node only has left child
				stack.push(temp);  //add left child then add parent
				stack.push(temp.left);

			}else      //if the node has left and right
				if(temp.right!=null) stack.push(temp.right);
				stack.push(temp);
				if(temp.left!=null) stack.push(temp.left);
		}

	}



	@Override
	public void preorder(){
		preorder(root);
	}


	public void preorder(TreeNode<E> root){
		if(root==null) return;

		System.out.print(root.elemet+" ");
		preorder(root.left);
		preorder(root.right);
	}


	public void preorderNonRecursive{

		Stack<E> stack = new Stack<>();
		if(root!=null) stack.push(root);

		while(!stack.isEmpty()){
			Treenode<E> temp = stack.pop();
			System.out.print(temp.element);

			if(temp.right!=null) stack.push(temp.right);
			if(temp.left!=null) stack.push(tem.left);
			
		}

	}

	public void postorder(){
		postorder(root);
	}

	public void postorder(TreeNode<E> root){
		if(root==null) return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element+" ");
	}


	public void postorderNonRecursive{
		Stack<E> stack = new Stack<>();
		if(root!=null){
			stack.push(root);
		}else{
			return;
		}

		Treenode<E> current, previous;

		while(!stack.isEmpty()){
			previous=current;
			current = stack.pop();

			if(current.left==null && current.right==null){   //case 1: the node is a leaf
				System.out.print(current.element);
				previous=current;
				current = stack.pop();
				
				while(isParent(current,previous)==true && !stack.isEmpty()){  //check if current is the parent of the previous, if current is the parent, print current
					System.out.print(current.element);
					previous=current;
					current=stack.pop();
				}			


				if(current!=null && !stack.isEmpty()) stack.push(current);  //if current is not parent, push it back to the stack

			}else{                          //case 2: the node is not a leaf
				stack.push(current);
				if(current.right!=null) stack.push(right)
				if(current.left!=null) stack.push(left);

			}
		}

	}


	private static boolean isParent(Treenode<E> current, Treenode<E> previous){
		if(current.left==previous || current.right==previous) return true;
		
		return false;
	}

	public java.util.Iterator<E> iterator(){
		return new InorderIterator();
	}


	/** 25.1 Displays the nodes in a breadth-first traversal */
	public void breadthFirstTraversal(){
		breadthFirstTraversal(root);
	}

	public void breadthFirstTraversal(root){
		if(root==null) return;

		Queue<TreeNode<E>> q = new LinkedList<TreeNode<E>>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode<E> temp = q.remove();
			System.out.println(temp.element+" ");
			if(q.left!=null) q.add(temp.left);
			if(q.right!=null) q.add(tep.right);
		}

	}


	public int height(){
		height(root);
	}


	public int height(TreeNode<E> aNode){

		if(aNode==null) return -1;
		
		return 1 + Math.max(height(aNode.left),height(aNode.right));
	}


	public boolean isFullBST(){
		int height=height();
		int numberOfNodes = getNumberofNodes();

		return (Math.pow(2,height)-1))==numberOfNodes;
	}

	public int getNumberofNodes(){
		getNumberofNodes(root);
	}

	public int getNumberofNodes(TreeNode<E> root){
		if(root==null) return 0;

		return 1+getNumberofNodes(root.left)+getNumberofNodes(root.right);
	}

	public int getNumberOfLeaves(){
		getNumberOfLeaves(root);
	}

	public int getNumberOfLeaves(TreeNode<E> root){
		if(root == null) return 0;

		if(root.left==null && root.right==null) return 1;

		return getNumberOfLeaves(root.left)+getNumberOfLeaves(root.right);
	}


	public int getNumberOfNonLeaves(){
		getNumberOfNonLeaves(root);
	}

	public int getNumberOfNonLeaves(TreeNode<E> root){
		if(root=null) return 0;

		if(root.left!=null || root.right != null) return 1;

		return getNumberOfNonLeaves(root.left)+getNumberOfNonLeaves(root.right);
	}


	private class InorderIterator implements java.util.Iterator<E>{
		private ArrayList<E> list = new ArrayList<>();
		private current=0;


		public InorderIterator(){
			inorder();
		}

		private void inorder(){
			inorder(root);
		}

		private void inorder(TreeNode<E> root){
			while(root!=null){
				inorder(root.left);
				list.add(root);
				inorder(root.right);
			}
		}

		public boolean hasNext(){
			return current<list.size;
		}


		public E next(){
			return list.get(current++);

		}


		public void remove(){
			delete(current);
			list.clear();
			inorder(root);
		}
	}


	public java.util.Iterator<E> bidirectionalInterator(){
		returns BidirectionalIterator
	}

	private class BidirectionalIterator implements Iterator<E>{
		private ArrayList<E> list = new java.util.ArrayList<E> list;
		private int current = 0;
		
		public BidirectionalInterar(){
			inorder();
		}

		private void inorder(){
			inorder(root);
		}

		private void inorder(root){
			if(root==null) return;

			inorder(left);
			list.add(root);
			inorder(right);
		}

		public boolean hasNext(){
			return current<list.size;
		}

		public boolean hasPrevious(){
			return current>0;
		}


		public E next(){
			return list.get(current);
			current++;
		}

		public E previous(){
			return list.get(current-1);
			current--;
		}

		public void remove(){
			delete(list.get(current));
			list.clear();
			inorder();
			
		}
			

	}



	public java.util.Iterator<E> preorderIterator(){
		return new PreorderIterator();
	}

	private class PreorderIterator extends Iteraor<E>{
		private ArrayList<E> list = new ArrayList<>();
		int current = 0;

		public PreorderIterator(){
			preorder();
		}

		private preorder(){
			preorder(root);
		}

		private preorder(Treenode<E> root){
			if(root==null) return;

			list.add(root);
			preorder(root.left);
			preorder(root.right);
		}

		public boolean hasNext(){
			return current<list.size();
		}

		public E next(){
			return list.get(current);
		}

		public void remove(){
			delete(list.get(current));
			list.clear();
			preorder();
		}

	}

	public void clear(){
		root=null;
		size=0;
	}

	public int getSize(){
		return size;
	}

	public java.util.list<TreeNode<E>> path(E e){
		ArrayList<TreeNode<E>> list = new ArrayList<>();

		TreeNode<E> current = root;

		while(current!=null){
			list.add(current);
			if(e.compareTo(current.element)<0){
				current=current.left;
			}else if(e.compareTo(current.element)>0){
				current=current.right;
			}else{
				break;
			}
		}

		return list;
	}

	@override
	public boolean equal(Treenode<E> other){
		private ArrayList<E> list = new ArrayList<>();
		
		Iterator<E> it = iterator();
		Iterator<E> itOther = list.iterator();

		while(it.hasNext && itOther.hasnext()){
			if(it.next()!=itOther.next()){
				return false;
			}
		}
	}


	@Override
	public object clone(){
		private MyBST BSTClone = new MyBST();
		Iterator<E> it = iterator();

		while(it.hasNext){
			BSTClone.add(it.next());
		}

		return BSTClone;
	}


	private class TreeNode<E extends Comparable<E>>{
		protected E element;
		protected TreeNode<E> left;
		protected TreeNode<E> right;

		public TreeNode(E e){
			element=e;
		}
	}

}