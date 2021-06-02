import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static long kadanesAlgo(int[]arr, int n){
        long maxSum = Integer.MIN_VALUE;
        long currSum =0;
        for(int i=0; i<n; i++){
            // (a+b)%x = (a%x + b%x)%x;
            currSum = (currSum + arr[i]);
            if(maxSum < currSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum =0;
            }
        }
        return maxSum;
    }
	public static void main (String[] args) throws IOException {
                      // Your code here
       //arr - 0 to N

      // arr from index i  to j where 0 <= i, j <= N-1
      BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
      //BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
      int testcases = Integer.parseInt(rd.readLine());
      while(testcases-- >0){
          int N = Integer.parseInt(rd.readLine());
          String[] arrInput = rd.readLine().split(" ");
          int arr[] = new int[N];
          for(int i=0; i<N; i++){
              arr[i] = Integer.parseInt(arrInput[i]);
          }

          System.out.println(kadanesAlgo(arr, N));
      }
	}
}
