package unionFindDT;
/**
 * this class further improved quick union find class
 * instead of use unbalanced tree, this class use balanced tree technique
 * to reduce the depth of tree which further increase the 
 * efficiency of the algorithm
 * 
 * @author Junyao Yang
 */
public class ImprovedQuickUF {
	
	private int[] id;
	private int[] sz;
	
	public ImprovedQuickUF( int N) {
		
		id = new int[N];
		
		for ( int i = 0; i < id.length; i++)
		{
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	/**
	 * helper root
	 */
	private int root( int i) {
		while( i != id[i] ) i = id[i];
		// the algorithm can be further improved
		//by add path compression
		/*
		 * while ( i != id[i] ) 
		 * {
		 * 		id[i] = id[id[i]];
		 * 		i =id[i];
		 * }
		 */
		return i;
	}
	
	
	
	
	public void union( int p, int q ) {
		
		int rp = root(p);
		int rq = root(q);
		
		if(rp != rq) return;
		if( sz[rq] < sz[rp]) {	id[rq] = rp;	sz[rp] += sz[rq];}
		
		else		   		{	id[rp] = rq;	sz[rq] += sz[rp];}
		
	}
	
	public boolean connected( int p, int q) {
		return root(p) == root(q);
	}
	
	
	
	
	
	
	
	
	
	
}
