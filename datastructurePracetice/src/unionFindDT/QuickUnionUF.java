package unionFindDT;
/**
 * this is improved version of union find data type
 * this data type use tree structure to increase the efficiency of 
 * union find data type. every connected component is a tree, two element are connected
 * only if they are in the same tree. that is it, every index store a value that represent
 * their parent. root store its index as value. 
 * @author ksacr
 *
 */
public class QuickUnionUF implements UF{

	private int[] id;
	
	public 	QuickUnionUF( int N) {
		
		id = new int[N];
		
		for ( int i = 0; i < id.length; i++){
			id[i] = i;
		}
	}
	/**
	 * this is a helper method that help to 
	 * find the root of index i
	 */
	private int root( int i ){
		
		while( i != id[i] ) i = id[i];
		
		return i;
	}
	
	/**
	 * change root of p to point to root of q
	 * (depth of p and q array accesses)
	 */
	@Override
	public void union(int p, int q) {
		
		int i = root(p);
		int j = root(q);
		id[i] = j;
		
	}
	
	/**
	 * check if p and q have same root
	 * (depth of p and q accesses
	 */
	@Override
	public boolean connected(int p, int q) {
		
		return root(p) == root(q);
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
