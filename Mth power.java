import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int flag = 0;
			if(m==1){
				if(isprime(n)){
					flag = 1;
				}
			}
			else{
				for(int i=2;Math.pow(i,m)<=n;i++)
				{
					if(isprime(i) && Math.pow(i,m)==n)
					{
						flag = 1;
						break;
					}
				}
			}
			
			if(flag==1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	static boolean isprime(int k)
	{
		int flag = 0;
		for(int i=2;i*i<=k;i++)
		{
			if(k%i==0)
			{
				flag = 1;
				break;
			}
		}
		if(flag==1){
			return false;
		}
		else
			return true;
	}
	
}
