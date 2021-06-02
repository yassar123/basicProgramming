import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Q = scn.nextInt();
		int arr[] = new int[N];
		int[] freqArr = new int[100001];
		for(int i=0; i<N; i++){
			int x = scn.nextInt();
			arr[i] = x;
			freqArr[x]++;
		}
		for(int i=1; i<=100000; i++){ //contiguous sum
			freqArr[i] = freqArr[i] + freqArr[i-1];
		}

		for(int i = 1; i <= Q; i++){
			int L =scn.nextInt();
			int R = scn.nextInt();
			System.out.println(freqArr[R]-freqArr[L-1]);
		}
	}
}
