import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- >0){
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size;i++){
				arr[i] =sc.nextInt();
			}

			int n = (1+(int)Math.sqrt(1+8*size))/2;
		//	System.out.print(n);
			int[] temp = new int[n];
			temp[0] =(int)Math.sqrt((arr[0]*arr[1])/arr[n-1]);
			System.out.print(temp[0]+" ");

			for(int i =1;i<n;i++){
				temp[i]=arr[i-1]/temp[0];
				System.out.print(temp[i]+" ");
			}
				System.out.println();
		}
	}
}
