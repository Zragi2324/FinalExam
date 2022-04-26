package insertionSort;

//public class insertionSort {

	public class insertionSort{
		
	insertionSort(int arr[], int n) 
	
    { 
        if (n <= 1)                             
        {
            return; 
        }
        insertionSort( arr, n-1 );  // sort the remaining array
      
       
        int last = arr[n-1];       //last element of the array
        int j = n-2;               //correct index of last element of the array
       
        while (j >= 1 && arr[j+1] > last) //find the correct index 
        { 
            arr[j+1] = arr[j];     //shift section of sorted elements upwards 
            j--; 
        } 
        arr[j] = last;  
        
     
}
	
	public int checkPositives(int arr[], int n) {
		
		
		
		int result = 1;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i] < 0) {
				result = 0;
			}
		}
		return result;
	}
	
public int checkNegatives(int arr[], int n) {
		
		
		
		int result = 1;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i] > 0) {
				result = 0;
			}
		}
		return result;
	}
	
public int checkMixed(int arr[], int n) {
	
	
	int x = 0;
	int y = 0;
	int z = 0;
	int result = 0;

	for(int i = 0; i < arr.length; i++) {

		if(arr[i] <0) {
			x = 1;

		}
		if(arr[i] > 0) {
			y = 1;

		}
		if(arr[i] == 0) {
			z = 1;
		}
	}

	if((x == 1) && (y == 1) && (z == 1)) {
	result = 1;
	}
	return result;
}


	private void insertionSort(int[] arr2, int i) {
		// TODO Auto-generated method stub
		
	}
}