public class Practice01MathIterative implements Practice01Math{

	public int fact (int n) throws Exception{
		if(n<0)
			throw new Exception("Number must be greater than or equal to zero");
		int f =1;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
		
	}

	public int fib (int n) throws Exception{
		if(n<0)
			throw new Exception("Number must be greater than or equal to zero.");
		//int y = 0;
		int prev = 1;
		int sum=1;
		if(n<2)
			return n;
		for(int i=2;i<n;i++){
			int x=sum;
			sum+=prev;
			prev=x;
		}
		return sum;
	}

}