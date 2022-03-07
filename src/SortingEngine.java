import java.util.Scanner;

public class SortingEngine {
	
	public static void swap(int[] array,int first,int second) {
		int temp=array[first];
		array[first]=array[second];
		array[second]=temp;
	}
	

	public static void sequentialPop(int[] array) {
		for(int x=0; x<100;x++)
			array[x]=x+1;
	}
	public static void shuffle(int[] array) {
		if(array.length>1) {
			int min=0,max=array.length-1,temp;
			int random;
			for(int x=0;x<array.length;x++)
			{
				random = (int)(Math.random()*(max)+min);
				swap(array,random,x);
			}
		}
	}
	
	public static void randomPop(int[] array) {
		sequentialPop(array);
		shuffle(array);
	}
	
	public static boolean isSorted(int[] array) {
		for(int x=0;x<array.length-1;x++)
			if(array[x]>array[x+1])
				return false;
		return true;
		
	}
	
	public static void display(int[] array) {
		for(int x=0; x<array.length;x++) {
			System.out.print(array[x]);
			if(array[x]<10)
				System.out.print("   ");
			else if(array[x]<100)
				System.out.print("  ");
			else
				System.out.print(" ");
			if(x%10==9)
				System.out.println();
		}
	}
	
	public static int linearSearch(int number, int[] array) {
		for(int x=0;x<array.length;x++)
			if(array[x]==number)
				return x;
		return -1;
	}
	
	public static int binarySearch(int number,int[] array) {
		int lowerbound=0,res=-1;
		int upperbound=array.length-1;
		
		if(array[lowerbound]==number)
			return lowerbound;
		else if(array[upperbound]==number)
			res=upperbound;
		
		int current=-1;
		do {
			current=(lowerbound+upperbound)/2;
			
			if(number==array[current]){
        if(current<res || res==-1){
          res=current;
        }
        upperbound=current;
      }
			else if(number>array[current])
				lowerbound=current;
			else if(number<array[current])
				upperbound=current;
			
		}while(lowerbound!=upperbound-1&&lowerbound!=upperbound);
		return res;
		
	}
	
	public static void bubbleSort(int[] array) {
		int x=0,attemp=0;
		do {
			for(x=0;x<array.length-1-attemp;x++) {
				if(array[x]>array[x+1]) {
					swap(array,x,x+1);
				}
			}
			attemp++;
		}while(!isSorted(array));
	}
	
	public static void selectionSort(int[] array) {
		int min=0,x=0,y=0,temp=0;
		for(x=0;x<array.length;x++) {
			min=x;
			for(y=x;y<array.length;y++) {
				if(array[y]<array[min])
					min=y;
			}
			swap(array,min,x);
		}
	}
	
	public static void selectionSort2(int[] array) {
		int smallest=0,largest=0;
		for(int x=0;x<(array.length)/2;x++) {
			smallest=x;
			largest=x;
			for(int y=x;y<array.length-x;y++) {
				if(array[y]<array[smallest])
					smallest=y;
				if(array[y]>array[largest])
					largest=y;
			}
			if(largest==x)
				largest=smallest;
			swap(array,smallest,x);
			swap(array,largest,array.length-x-1);
			
		}
	}
	
	public static void insertionSort(int[]array) {
		int current=-1,temp;
		for(int x=1;x<array.length;x++) {
			if(array[x]<array[x-1]) {
				current=x;
				while(array[current]<array[current-1]&&current>1) {
					swap(array,current,current-1);
					current--;
				}
				if(array[1]<array[0]) {
					swap(array,1,0);
				}
				
			}
		}

	}
	public static void insertionSort2(int[] array) {
		for(int x=1;x<array.length;x++) {
			if(array[x]<array[0]) {
				for(int i=x;i>0;i--)
					swap(array,i,i-1);
			}
			else {
				for(int j=1;j<x;j++) {
					if(array[x]<array[j])
						for(int k=x;k>j;k--)
							swap(array,k,k-1);
				}
			}
		}
		
	}

	public static void quickSort(int[] array, int begin, int end) {
		if(array.length>0) {
			int left = begin, right =end;
			do {
				while(array[right]>=array[left]&&right>left) {
					right--;
				}
				swap(array,left,right);
				while(array[left]<=array[right]&&left<right) {
					left++;
				}
				swap(array,left,right);
			}while(left!=right);
			if(left-begin>1)
				quickSort(array,begin,left-1);
			if(end-right>1)
				quickSort(array,right+1,end);
		}
	}
	
	public static void mergeSort(int begin, int end, int[] array) {
		if(array.length>0) {
			int middle=(begin+end)/2;
			int leftindex=0,rightindex=0;
			int[] left = new int[middle-begin+1];
			int[] right=new int[end-middle];
			for(int x=0;x<left.length;x++) {
				left[x]=array[x];
			}
			for(int x=0;x<right.length;x++) {
				right[x]=array[x+middle+1];
			}
			if(array.length>=2) {
				mergeSort(0,left.length-1,left);
				mergeSort(0,right.length-1,right);
			}
			for(int x=0;x<array.length;x++) {
				if(leftindex>=left.length) 
					array[x]=right[rightindex++];
				else if(rightindex>=right.length)
					array[x]=left[leftindex++];
				else if(left[leftindex]<right[rightindex])
					array[x]=left[leftindex++];
				else
					array[x]=right[rightindex++];
			}
		}
	
	}
	
	public static int digitAt(int number,int digit) {
		number=number/(int)Math.pow(10, digit);
		return number%10;
	}
	public static void radixSort(int[] array) {
		int[] temp=new int[array.length];
		int pr;
		for(int i=0;i<3;i++) {
			pr=0;
			for(int j=0;j<10;j++) {
				for(int x=0;x<array.length;x++) {
					if(digitAt(array[x],i)==j) {
						temp[pr++]=array[x];
					}
				}
			}
		for(int x=0;x<array.length;x++) {
			array[x]=temp[x];
		}
		}
	}
	public static int errorTrap() throws Exception{
		Scanner s=new Scanner(System.in);
		int res=-1;
		try {
			res=s.nextInt();
		}catch(Exception E) {
			System.out.println("Invalid input, try again. Exception: "+E);
			s.next();
		}
		return res;
	}
	
	
	public static void main(String[] args) throws Exception{
		int choice =-1;
		int[] array=new int[100];
		
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Populate the array sequentially from 1 to 100 ");
			System.out.println("2. Populate the array randomly with numbers from 1 to 100 ");
			System.out.println("3. Checks to see if the array is sorted");
			System.out.println("4. Displays the array to the screen in a neatly arranged grid with numbers aligned in rows \r\n"
					+ "and columns");
			System.out.println("5. Shuffles the array");
			System.out.println("6. Linear search");
			System.out.println("7. Binary search");
			System.out.println("8. Bubble sort");
			System.out.println("9. Selection sort");
			System.out.println("10. Insertion sort");
			System.out.println("11. Quick sort");
			System.out.println("12. Merge sort");
			System.out.println("13. Radix sort");

			
			choice=errorTrap();
			
			if(choice==1)
				sequentialPop(array);
			else if(choice==2)
				randomPop(array);
			else if(choice==3)
				System.out.println(isSorted(array));
			else if(choice==4) {
				display(array);
				Thread.sleep(4000);
				}
			else if(choice==5)
				shuffle(array);
			else if(choice==6) {
				int number,res;
				System.out.println("Enter the number you would like to find: ");
				number=errorTrap();
				res=linearSearch(number,array);
				if(res!=-1)
					System.out.println("Number is at index "+res);
				else
					System.out.println("Number does not exist in the array");
				Thread.sleep(1000);
				System.out.println();
			}
			else if(choice==7) {
				if(isSorted(array)) {
					int number,res;
					System.out.println("Enter the number you would like to find: ");
					number=errorTrap();
					res=binarySearch(number,array);
					if(res!=-1)
						System.out.println("Number is at index "+res);
					else
						System.out.println("Number does not exist in the array");
				}
				else {
					System.out.println("Array is not sorted, please sort the array first.");
				}
				Thread.sleep(1000);
				System.out.println();
			}
			else if(choice==8) {
				bubbleSort(array);
			}
			else if(choice==9) {
				selectionSort(array);
			}
			else if(choice==10) {
				insertionSort2(array);
			}
			else if(choice==11) {
				quickSort(array,0,array.length-1);
			}
			else if(choice==12) {
				mergeSort(0,array.length-1,array);
			}
			else if(choice==13) {
				radixSort(array);
			}

			
		}while(choice!=0);
		System.out.println("Thank you for using the searching and sorting engine. Hope to see you next time!");
		
	}

}
