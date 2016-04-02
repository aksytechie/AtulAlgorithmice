
public class calcMaxContSum {
	public static void main(String args[])
	{
		int N = Integer.parseInt(args[0]);
		maxContSum M = new maxContSum(N);
		M.dispArr();
		//System.out.println(M.recCalcContSum(N-1));
		System.out.println(M.itCalcContSum());
	}
}
