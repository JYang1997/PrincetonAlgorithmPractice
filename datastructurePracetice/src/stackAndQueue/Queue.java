package stackAndQueue;

public interface Queue<A> {
	
	void enqueue(A a);
	
	A dequeue( );
	
	boolean isEmpty( );
	
	int size( );

}
