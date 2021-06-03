import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count=0;
            int prime = 1;
            for(int i=2;i<=n;i++)
            {
                  for(int j=2;j*j<=i;j++)
                  {
                        if(i%j==0)
                        {
                              prime=0;
                              break;
                        }
                  }
                  if(prime==1){
                        count++;
                  }
                  prime=1;
            }
            System.out.print(count);
	}
}
