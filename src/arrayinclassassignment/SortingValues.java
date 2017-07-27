package arrayinclassassignment;

public class SortingValues {
	/**
	 * Array In Class Assignment
	 * 
	 * @author Anna Volkova
	 */

	public static void main(String[] args) {
		
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		// Swap the values around to put them ascending order.
		/*
		 * for ( ; ; ) { for ( ; ; ) { if ( ) { // swap the values in two slots
		 * } } }
		 */
		
		for (int i = 0; i < arr.length - 1; i++) 
		{ 		
			for (int j = i+1 ; j < arr.length; j++) 
			{ 
				
				if (arr[j] < arr[i]) 
				{ // swap the values in two slots
					int	temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} 
			} 
		}
				
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

/*
Output:

before: 45 87 39 32 93 86 12 44 75 50 
after : 12 32 39 44 45 50 75 86 87 93 

*/