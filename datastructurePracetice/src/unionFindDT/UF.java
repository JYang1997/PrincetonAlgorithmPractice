package unionFindDT;
/**
 * This is practice from Princeton algorithm part1 
 * 
 * union find data type inferface
 * 
 * @author Junyao Yang
 *7/25/2017
 *
 */
public interface UF {
	
	//initialize union-find data type structure with N objects(0-N-1);
	
	/**
	 * add connection between p and q
	 * @param p
	 * @param q
	 */
	void union(int p, int q);
	
	/**
	 * are p and q in the same component?
	 * @param p
	 * @param q
	 * @return
	 */
	boolean connected(int p, int q);
	
	/**
	 * component identifier for p(0 to N-1)
	 * @param p
	 * @return
	 */
	int find( int p);
	
	/**
	 * number of components
	 * @return
	 */
	int count();

	
}
