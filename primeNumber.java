import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			int flag=0;
			for(long i=2;i*i<=n;i++)//i<=n/2
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		
	}
	

}
