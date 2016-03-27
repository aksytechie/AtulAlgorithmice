
public class calcLegalPath {
	public static void main(String args[])
	{
		int N = Integer.parseInt(args[0]);
		legalPath L = new legalPath(N);
		L.printPathMat();
		L.countLegalPaths(N-1, N-1);
		System.out.println(L.legalPath);
	}
}
