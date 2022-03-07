
public class test {

	public static void main(String[] args) throws Exception{
		//search test
		int[] arraya= {};//empty set
		int[] arrayb= {1};//one number
		int[] arrayc= {1,2,3};//odd amount of numbers
		int[] arrayd= {1,2,3,4};//even amount of numbers
		
		
		System.out.println("Linear search test");
		try {
			if(SortingEngine.linearSearch(-1, arraya)==-1)
				System.out.println("Passed empty set and number not in array test.");
			else
				System.out.println("Error exist with working on empty set or number not in array");
		}catch(Exception E){
			System.out.println("Error exist with working on empty set or number not in array");
		}
		System.out.println();
		
		
		//sorting test
		int[] array0= {2,1,2,3,3}; //repeating numbers & odd amount of numbers
		int[] array1= {3,7,5,9}; //even amount of numbers
		int[] array2= {6};//one number
		int[] array3= {};//empty set
		
		
		//Bubble sort test
		
		System.out.println("Bubble sort test");
		try {
			SortingEngine.bubbleSort(array0);
			if(!SortingEngine.isSorted(array0))
				System.out.println("Error exist when working with repeating numbers or odd amount of numbers");
			else
				System.out.println("Passed repeating numbers and odd amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with repeating numbers");
		}
		
		try {
		SortingEngine.bubbleSort(array1);
		if(!SortingEngine.isSorted(array1))
			System.out.println("Error exist when working with even amount of numbers");
		else
			System.out.println("Passed even amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with even amount of numbers");
		}
		
		try {
			SortingEngine.bubbleSort(array2);
			if(!SortingEngine.isSorted(array2))
				System.out.println("Error exist when working with one number");
			else
				System.out.println("Passed one number test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with one number");
			}
		
		try {
			SortingEngine.bubbleSort(array3);
			if(!SortingEngine.isSorted(array3))
				System.out.println("Error exist when working with empty set");
			else
				System.out.println("Passed empty set test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with empty set");
			}
		System.out.println("Bubble sort test passed.");
		System.out.println();
		
		SortingEngine.shuffle(array0);
		SortingEngine.shuffle(array1);
		SortingEngine.shuffle(array2);
		SortingEngine.shuffle(array3);
		
		
		
		
		
		//selection sort test
		System.out.println("Selection sort test");
		try {
			SortingEngine.selectionSort(array0);
			if(!SortingEngine.isSorted(array0))
				System.out.println("Error exist when working with repeating numbers or odd amount of numbers");
			else
				System.out.println("Passed repeating numbers and odd amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with repeating numbers");
		}
		
		try {
		SortingEngine.selectionSort(array1);
		if(!SortingEngine.isSorted(array1))
			System.out.println("Error exist when working with even amount of numbers");
		else
			System.out.println("Passed even amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with even amount of numbers");
		}
		
		try {
			SortingEngine.selectionSort(array2);
			if(!SortingEngine.isSorted(array2))
				System.out.println("Error exist when working with one number");
			else
				System.out.println("Passed one number test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with one number");
			}
		
		try {
			SortingEngine.selectionSort(array3);
			if(!SortingEngine.isSorted(array3))
				System.out.println("Error exist when working with empty set");
			else
				System.out.println("Passed empty set test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with empty set");
			}
		System.out.println("Selection sort test passed.\n");
		System.out.println();
		
		SortingEngine.shuffle(array0);
		SortingEngine.shuffle(array1);
		SortingEngine.shuffle(array2);
		SortingEngine.shuffle(array3);

		
		
		
		
		
		System.out.println("SelectionSort2 test");
		try {
			SortingEngine.selectionSort2(array0);
			if(!SortingEngine.isSorted(array0))
				System.out.println("Error exist when working with repeating numbers or odd amount of numbers");
			else
				System.out.println("Passed repeating numbers and odd amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with repeating numbers");
		}
		
		try {
		SortingEngine.selectionSort2(array1);
		if(!SortingEngine.isSorted(array1))
			System.out.println("Error exist when working with even amount of numbers");
		else
			System.out.println("Passed even amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with even amount of numbers");
		}
		
		try {
			SortingEngine.selectionSort2(array2);
			if(!SortingEngine.isSorted(array2))
				System.out.println("Error exist when working with one number");
			else
				System.out.println("Passed one number test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with one number");
			}
		
		try {
			SortingEngine.selectionSort2(array3);
			if(!SortingEngine.isSorted(array3))
				System.out.println("Error exist when working with empty set");
			else
				System.out.println("Passed empty set test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with empty set");
			}
		System.out.println("SelectionSort2 test passed.");
		System.out.println();
		
		SortingEngine.shuffle(array0);
		SortingEngine.shuffle(array1);
		SortingEngine.shuffle(array2);
		SortingEngine.shuffle(array3);
		
		
		//Insertion sort test
		
		System.out.println("Insertion sort test");
		try {
			SortingEngine.insertionSort(array0);
			if(!SortingEngine.isSorted(array0))
				System.out.println("Error exist when working with repeating numbers or odd amount of numbers");
			else
				System.out.println("Passed repeating numbers and odd amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with repeating numbers");
		}
		
		try {
		SortingEngine.insertionSort(array1);
		if(!SortingEngine.isSorted(array1))
			System.out.println("Error exist when working with even amount of numbers");
		else
			System.out.println("Passed even amount of numbers test.");
		}catch(Exception e) {
			System.out.println("Error exist when working with even amount of numbers");
		}
		
		try {
			SortingEngine.insertionSort(array2);
			if(!SortingEngine.isSorted(array2))
				System.out.println("Error exist when working with one number");
			else
				System.out.println("Passed one number test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with one number");
			}
		
		try {
			SortingEngine.insertionSort(array3);
			if(!SortingEngine.isSorted(array3))
				System.out.println("Error exist when working with empty set");
			else
				System.out.println("Passed empty set test.");
			}catch(Exception e) {
				System.out.println("Error exist when working with empty set");
			}
		System.out.println("Insertion sort test passed.");
		System.out.println();
		
		SortingEngine.shuffle(array0);
		SortingEngine.shuffle(array1);
		SortingEngine.shuffle(array2);
		SortingEngine.shuffle(array3);
		
		
		
		
		
		
		//Quick sort test
		
				System.out.println("Quick sort test");
				try {
					SortingEngine.quickSort(array0,0,array0.length-1);
					if(!SortingEngine.isSorted(array0))
						System.out.println("Error exist when working with repeating numbers or odd amount of numbers");
					else
						System.out.println("Passed repeating numbers and odd amount of numbers test.");
				}catch(Exception e) {
					System.out.println("Error exist when working with repeating numbers");
				}
				
				try {
				SortingEngine.quickSort(array1,0,array1.length-1);
				if(!SortingEngine.isSorted(array1))
					System.out.println("Error exist when working with even amount of numbers");
				else
					System.out.println("Passed even amount of numbers test.");
				}catch(Exception e) {
					System.out.println("Error exist when working with even amount of numbers");
				}
				
				try {
					SortingEngine.quickSort(array2,0,array2.length-1);
					if(!SortingEngine.isSorted(array2))
						System.out.println("Error exist when working with one number");
					else
						System.out.println("Passed one number test.");
					}catch(Exception e) {
						System.out.println("Error exist when working with one number");
					}
				
				try {
					SortingEngine.quickSort(array3,0,array3.length-1);
					if(!SortingEngine.isSorted(array3))
						System.out.println("Error exist when working with empty set");
					else
						System.out.println("Passed empty set test.");
					}catch(Exception e) {
						System.out.println("Error exist when working with empty set");
					}
				System.out.println("Quick sort test passed.");
				System.out.println();
				
				SortingEngine.shuffle(array0);
				SortingEngine.shuffle(array1);
				SortingEngine.shuffle(array2);
				SortingEngine.shuffle(array3);
				
				//Merge sort test
				
				System.out.println("Merge sort test");
				try {
					SortingEngine.mergeSort(0,array0.length-1,array0);
					if(!SortingEngine.isSorted(array0))
						System.out.println("Error exist when working with repeating numbers or odd amount of numbers");
					else
						System.out.println("Passed repeating numbers and odd amount of numbers test.");
				}catch(Exception e) {
					System.out.println("Error exist when working with repeating numbers");
				}
				
				try {
				SortingEngine.mergeSort(0,array1.length-1,array1);
				if(!SortingEngine.isSorted(array1))
					System.out.println("Error exist when working with even amount of numbers");
				else
					System.out.println("Passed even amount of numbers test.");
				}catch(Exception e) {
					System.out.println("Error exist when working with even amount of numbers");
				}
				
				try {
					SortingEngine.mergeSort(0,array2.length-1,array2);
					if(!SortingEngine.isSorted(array2))
						System.out.println("Error exist when working with one number");
					else
						System.out.println("Passed one number test.");
					}catch(Exception e) {
						System.out.println("Error exist when working with one number");
					}
				
				try {
					SortingEngine.mergeSort(0,array3.length-1,array3);
					if(!SortingEngine.isSorted(array3))
						System.out.println("Error exist when working with empty set");
					else
						System.out.println("Passed empty set test.");
					}catch(Exception e) {
						System.out.println("Error exist when working with empty set");
					}
				System.out.println("Merge sort test passed.");
		
		System.out.println();
		SortingEngine.shuffle(array0);
		SortingEngine.shuffle(array1);
		SortingEngine.shuffle(array2);
		SortingEngine.shuffle(array3);
		

	}

}
