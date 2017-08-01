package elmentarySorts;
/**
 * Included generic elementary sorts
 * insertion, selection, bubble sort, shell sort, merge sort
 * quick sort, etc.....
 * @author junyao yang
 *
 */
public class ElementarySorts <T extends Comparable<T>> {

	
	//methods for exchange and compare!
	private void exchange(T[] a, int i, int j){
		T swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		
	}
	
	private boolean less(T v, T w)
	{
		return v.compareTo( w)<0;
	}
	
	public void selectionSort(T[] list)
	{
		int size = list.length;
		for ( int i = 0; i < size; i++){
			
			int minIndex = i;
			//searching for minimum in remaining list.
			for ( int j = i; j < size; j++)
				if ( less( list[j], list[minIndex] )) { minIndex = j;}
					
			exchange( list, i, minIndex);
		}
	}
	
	public void insertionSort(T[] list){
	
		int size = list.length;
		
		for ( int i = 0; i < size; i++)
			for ( int j = i; j > 0; j--)
				if ( less( list[j], list[j-1] ))
					exchange( list, j, j-1); 
				
	}
	
	public void bubbleSort(T[] list){
		
		int size = list.length;
		
		for ( int i = 1; i < size; i++)
			for ( int j = 0; j < size - i; j++)
				if ( less( list[j+1], list[j]) ) 
					exchange( list, j+1, j);
			
		
	}
	
	// use ....
	public void shellSort(T[] list){
		
	}
	
	
	public static void main(String [] args){
		
		
	}
	
}
