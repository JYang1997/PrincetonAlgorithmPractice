package stackAndQueue;

public class LinkedListStack < A > implements Stack< A >  {

	private Node<A> first;
	private int size;
	
	public LinkedListStack( ) {
		size = 0;
	}
	@Override
	public void push(A element) {
	
		Node<A>  previousNode = first;
		Node<A> currentNode =  new Node<A>(element,null );
		first = currentNode;
		first.setNext(previousNode);
		size++;
	}

	@Override
	public A pop() {
		if (isEmpty() ) return null;	
		A currentValue = first.getValue();
		first = first.getNext();
		size--;
		return currentValue;
		
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
	
		 if (first == null ) return true;
		 return false;
	}
	
	public static void main(String [] args) {
		
		Stack<Integer > stack = new LinkedListStack<>();
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		for ( int i = 0; i < 10; i++)
			stack.push(i+2);
		
		for ( int i = 0; i < 5; i++)
		System.out.println(stack.pop()+" "+ stack.size());
		
		System.out.println(stack.isEmpty());
		
	}
	
	
	

}
