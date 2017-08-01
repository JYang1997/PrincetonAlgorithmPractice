package unionFindDT;
/**
 * eager approach of union find data type
 *  this is very inefficient way of implementing the date type.
 * @author Junyao Yang
 *
 */
public class UnionFind implements UF {

	
	private int[] id;
	
	public UnionFind( int N) {
		id = new int[N];
		for ( int i = 0; i < N; i++)
			id[i] = i;
	}
	/**
	 * change all entries with id[p] to id[q]
	 * (at most 2N+2 array access)
	 * 
	 */
	@Override
	public void union(int p, int q) {
	/*	
		int pid = id[p];
		int qid = id[q];
		if ( id[p] != id[q] )
		{
			for ( int i = 0; i < id.length; i++)
				id[i] = (id[i] == pid) ? qid : id[i];
		}
	
	 */
		
		//lecture way
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++)
			if (id[i] == pid ) id[i] = qid;
	}
	
	
	@Override
	public boolean connected(int p, int q) {
		
		return id[p] == id[q];
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


