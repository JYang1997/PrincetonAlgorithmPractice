package stackAndQueue;
//singly node!
public class Node<A> {
	
	private A value;
	
	private Node<A> next;
	
	public Node( A value, Node<A> next) {
		
		this.value = value;
		
		this.next = next;
	}
	
	public A getValue(){
		return value;
	}
	
	public Node<A> getNext( ){
		return next;
	}
	
	public void setValue( A value ) {
		this.value = value;
		
	}
	
	public void setNext( Node<A> next) {
		this.next = next;
	}

}
