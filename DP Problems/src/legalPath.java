
public class legalPath {
	int n;
	char[][] pathMatrix;
	int legalPath;
	public legalPath(int N)
	{
		n=N;
		legalPath=0;
		pathMatrix = new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				if(i==0 && j==0)
				{
					pathMatrix[0][0]='.';
					continue;
				}
				if(i==n-1 && j==n-1)
				{
					pathMatrix[n-1][n-1]='.';
					continue;
				}
				double r= Math.random();
				if(r<0.35)
					pathMatrix[i][j]='+';
				else
					pathMatrix[i][j]='.';
			}
	}
	public void printPathMat()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(pathMatrix[i]);
		}
	}
	public void countLegalPaths(int i, int j)
	{
		if(i==0 && j==0)
			++legalPath;
		else if(i<0 || j<0)
			return;
		else if(i!=0 && pathMatrix[i-1][j]=='.')
			 countLegalPaths(i-1, j);
		if(j!=0 && pathMatrix[i][j-1]=='.')
			 countLegalPaths(i, j-1);
		return;
	}
}


