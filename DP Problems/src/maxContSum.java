import java.util.Random;

public class maxContSum {
	int arr[];
	int n;
	int memArr[];
	maxContSum(int N){
		Random rand = new Random(100);
		n=N;
		arr= new int[n];
		memArr = new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=rand.nextInt(10);
			memArr[i]=0;
		}
	}
	protected void dispArr()
	{
		for(int i=0;i<n;++i)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	protected int recCalcContSum(int N)
	{
		if(N < 0)
			return 0;
		if(N == 1)
			return arr[0];
		if(memArr[N]!=0)
			return memArr[N];
		return memArr[N] = Integer.max(recCalcContSum(N-1), recCalcContSum(N-2)+arr[N]);
	}
	protected int itCalcContSum()
	{
		memArr[0] = 0;
		memArr[1] = arr[0];
		for(int i=2; i< n ; ++i)
		{
			memArr[i] = Integer.max(memArr[i-1], memArr[i-2] + arr[i-1]);
		}
		return memArr[n-1];
	}
}
