package QuickSort;

public class ArrayPar {
	private long [] theArray;
	private int nElems;
	
	public ArrayPar(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}
	
	public int size() {
		return nElems;
	}
	
	public void display() {
		System.out.print("A=");
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j] +" ");
		System.out.print(" ");
		
		
		
	}
	
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
	int rightPtr = + 1;
		while(true) {
			while(leftPtr < right && theArray[++leftPtr] < pivot );
			while (rightPtr > left && theArray[--rightPtr] > pivot);
			if(leftPtr >= rightPtr)
				break;
			else 
			swap (leftPtr,  rightPtr);
					}
		
		return leftPtr;
	}
	
	public void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
	
	public void recQuickSort(int left, int right) {
		if(right - left <= 0)
			return;
	else {
			long pivot = theArray[right];
	
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition+1, right);
			}
	}
}

