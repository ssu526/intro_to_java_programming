

public interface MyList<E> extends java.lang.Iterable<E>{

	public void add(E e);

	public void add(int  index, E e);

	public void clear();
	
	public boolean contains(E e);
	
	public E get(int index);
	
	public int indexOf(E e);
	
	public boolean isEmpty();
	
	public int lastIndexOf(E e);
	
	public boolean remove(E e);
	
	public int size();
	
	public E remove(int index);
	
	public E set(int index, E e);

	/*public boolean addAll(MyList<E> otherList);

	public boolean removeAll(MyList<E> otherList);

	public boolean retainAll(MyList<E> otherList);*/
}


