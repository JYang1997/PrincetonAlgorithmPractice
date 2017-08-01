package stackAndQueue;

public class ArrayStack<A> implements Stack< A> {
	
	
	private A[] stack;
	
	private int size;
	
	@SuppressWarnings("unchecked")
	public ArrayStack( ) {
		
		 stack = (A[ ]) new Object[10];
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	private void resize( int newSize) {
		
		if( size == stack.length)
		{
			A[]  temp = (A[]) new Object[ newSize];
			for ( int i = 0; i < stack.length; i++)
				temp[i] = stack[i];
			stack = temp;
		}
	}
	
	public void push(A element) {
		
		resize(stack.length*2);
		stack[size] = element;
		size++;
		
	}
	
	public A pop( ) {
		if(isEmpty( )) return null;
		size--;
		A removedA= stack[size];
		stack[size] = null;
		
		return removedA;
		
	}
	
	
	public int size( ){
		return size;
	}
	
	public boolean isEmpty( ){
		
		if ( size == 0)	return true;
		return false;
	}

	public static void main ( String [] args)
	{
		
		Stack<Integer> stack1 = new ArrayStack<>();
		
		for(int i = 0; i< 10 ; i++)
		stack1.push(i);
		
		for(int i = 0; i<5; i++)
			System.out.println(stack1.pop());
		
		
		
	}
	
	
}
