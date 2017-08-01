package elmentarySorts;

import java.util.Arrays;
import java.util.Random;

public class ElementarySorts1demo {
	
	public void selectionSort(int[] list)
	{
		int size = list.length;
		
		for ( int i = 0 ; i < size; i++){
			int minIndex = i;
			for(int j = i; j < size; j++)
			{
				if ( list[minIndex] > list[j] )
				{
					minIndex = j;
				}
			}
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
			
				
		}
		
	}
	
	
	public void insertionSort(int[] list) {
		
		int size = list.length;
		
		for ( int i = 0; i < size; i++)
		{
			
			for ( int j = i; j > 0 ; j--)
			{
				if( list[j] < list[j-1])
				{
					int temp = list[j];
					list[j ] = list[j-1];
					list[j-1] = temp;
					
				}
			}
		}
	}
	
	public void bubbleSort(int[] list){
		
		int size = list.length;
		
		for(int i = 0; i < size-1; i++){
			
			for ( int j = 0; j < size-i-1; j++)
			{
				if ( list[j] > list[j+1])
				{
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
			
			
		}
	}
	
	
	
	public static void main(String [] args){
		ElementarySorts1demo obj = new ElementarySorts1demo();
		Random rand = new Random();
		int size = 10;
		int [] list = new int[size];
		for ( int i = 0; i < size; i++){
			list[i] = rand.nextInt(101);
		}
		
		
		obj.bubbleSort(list);
		
		System.out.println(Arrays.toString(list));
		
	}
}
