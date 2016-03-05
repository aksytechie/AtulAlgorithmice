import java.util.PriorityQueue;
public class MinDistReadSectors {
	
	static class MyInt implements Comparable<MyInt>
	{
		int value;
		MyInt(int val)
		{
			value = val;
		}
		@Override
		public int compareTo(MyInt obj)
		{
			return this.value - obj.value;
		}
	}
	static class Sectors 
	{
		PriorityQueue<MyInt> seq;
		int N;
		Sectors(PriorityQueue<MyInt> Secs, int n)
		{
			seq = Secs;
			N = n;
		}
		int minSectorTraversal()
		{
			return 0;
		}
		
	}
	public static void main(String args[])
	{
		
	}

}