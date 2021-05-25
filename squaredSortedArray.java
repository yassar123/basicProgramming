import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static void sortArr(long arr[], int n)
	{
		for(int i = 1 ; i < n ; i++)
		{
			long key = arr[i];
			int j = i-1;
			while(j >= 0 && key < arr[j])
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		for(int i = 0 ; i < n ; i++)
				System.out.print(arr[i] + " ");
	}
	public static void main (String[] args) {
		Scanner ipReader = new Scanner(System.in);
		int test = ipReader.nextInt();
		while(test-- > 0)
		{
			int size = ipReader.nextInt();
			long arr[] = new long[size];
			for(int i = 0 ; i < size ; i++){
				arr[i] = ipReader.nextLong();
				arr[i] *= arr[i];
			}
			sortArr(arr, size);
			
			System.out.println();
			
		}
	}
}
