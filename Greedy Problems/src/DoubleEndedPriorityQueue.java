import java.util.ArrayList;

public class DoubleEndedPriorityQueue<Type>{
	
	ArrayList<Type> PQListmin;
	ArrayList<Type> PQListmax;
	
	private void swap(int idx1,int idx2, int mode)
	{
		if(mode == 0)
		{
			Type temp1 = PQListmin.get(idx1);
			Type temp2 = PQListmin.get(idx2);
			PQListmin.add(idx2, temp1);
			PQListmin.add(idx1, temp2);
		}
		else if (mode == 1)
		{
			Type temp1 = PQListmax.get(idx1);
			Type temp2 = PQListmax.get(idx2);
			PQListmax.add(idx2, temp1);
			PQListmax.add(idx1, temp2);
		}
		
	}
	public void add(Type data)
	{
		PQListmin.add(data);
		PQListmax.add(data);
		if(PQListmin.size() != 1 && PQListmax.size() !=1)
		{
			for(int i=(PQListmin.size()-2)/2; i >=0 ; --i)
			{
				minHeapify(i);
				maxHeapify(i);
			}	
		}
			
	}
	public boolean compare(Type data1, Type data2)
	{
		return false;
	}
    public Type getMin()
    {
    	return PQListmin.get(0);
    }
    public Type getMax()
    {
    	return PQListmax.get(0);
    }
	public void minHeapify(int idx)
	{
		int smallest=idx;
		int left = idx*2 +1 ;
		int right = (idx+1)*2;
		if (left < PQListmin.size() && compare(PQListmin.get(left),PQListmin.get(idx)) )
		{
			smallest = left;
		}
		if (right < PQListmin.size()) 
		{
			if (compare(PQListmin.get(right),PQListmin.get(idx)) )
			    smallest = right;
		}
		if (smallest != idx)
		{
			swap(smallest,idx,0);
			minHeapify(smallest);
		}
	}
	public void maxHeapify(int idx)
	{
		int largest=idx;
		int left = idx*2 +1 ;
		int right = (idx+1)*2;
		if (left < PQListmax.size() && !compare(PQListmax.get(left),PQListmax.get(idx)) )
		{
			largest = left;
		}
		if (right < PQListmin.size() )
		{
			if(!compare(PQListmax.get(right),PQListmax.get(idx)))
			 largest = right;
		}
		if (largest != idx)
		{
			swap(largest,idx,1);
			minHeapify(largest);
		}
		
	}
}
