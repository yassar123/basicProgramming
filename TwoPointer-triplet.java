import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        // Your code here
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] s = rd.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
        long p = Long.parseLong(s[1]);
		long arr[] = new long[n];
        String[] arrInput = rd.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i] = Long.parseLong(arrInput[i]);
        }
        Arrays.sort(arr);
		long count=0;
        int j = 2;
		for(int i=0;i<n;i++){
            while(j<n && Math.abs(arr[i]-arr[j])<=p){
                count += ((j-i)*(j-i-1))/2;
                j++;
            }
        }
        System.out.print(count);

	}
}
