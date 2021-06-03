import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int divisorOfN(long n)
	{
		int count = 0, i;
		if(n % 2 != 0)
			return 0;
		for (i = 1; i*i <= n; i++)  
    	{
			if (n % i == 0)  
			{
				if (i % 2 == 0)  
					count++;
				if ((n / i) % 2 == 0)  
					count++;
			}
        }
    i--;  
    if (i * i == n)
        count--;
	return count;
	}
	public static void main (String[] args) {
        Scanner ipReader = new Scanner(System.in);
		int test = ipReader.nextInt();
		while(test-- > 0)
		{
			long num = ipReader.nextInt();
			System.out.println(divisorOfN(num));
		}
	}
}
