import java.util.ArrayList;
public class MinDistReadSectors {
	
	static class Sectors 
	{
		DoubleEndedPriorityQueue<Integer> secque;
		int secnum;
		int read;
		Sectors(DoubleEndedPriorityQueue<Integer> seq, int num)
		{
			secque = seq;
			secnum = num;
		}
		void minDistReadSectors()
		{
			int current=0;
			int min;
			int max;
			int flag=0;
			while(!secque.empty())
			{
				min = secque.getMin();
				max = secque.getMax();
				if( min < (secnum-max))
				{
					if(flag==1)
						flag=2;
					current = current + min;
					secque.remove(min);
					flag=0;
				}
				else
				{
					if(flag==0)
						flag=2;
					current = current + secnum - max;
					secque.remove(max);
					flag=1;
				}
			}	
		}
	}
	public static void main(String args[])
	{
		DoubleEndedPriorityQueue<Integer> test =  new DoubleEndedPriorityQueue<Integer>()
				{
				public boolean compare(Integer data1, Integer data2)
				{
					if(data1<data2)
						return true;
					else
						return false;
				}
				};
		test.PQListmax = new ArrayList<Integer>(11);
		test.PQListmin = new ArrayList<Integer>(11);
		int N = new Integer(100);
		test.add(10);
		test.add(70);
		test.add(60);
		Sectors S = new Sectors(test,N);
		
	}

}