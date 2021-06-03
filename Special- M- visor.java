static String checkSpecial_M_Visor(int N, int M)
	{
	   //Enter your code here
	   int count=0;
	   for(int i=2;i<=N;i+=2)
	   {
		   if(N%i==0)
		   {
			   count++;
		   }
	   }
	   if(count==M){
		   return "Yes";
	   }
	   else{
		   return "No";
	   }
	}
