import java.util.ArrayList;

public class DoubleEndedPriorityQueue<Type>{
	
	ArrayList<Type> PQListmin;
	ArrayList<Type> PQListmax;
	
	public boolean empty()
	{
		if(PQListmin.size()==0)
			return true;
		return false;
	}
	private void swap(int idx1,int idx2, int mode)
	{
		if(mode == 0)
		{
			Type temp1 = PQListmin.get(idx1);
			Type temp2 = PQListmin.get(idx2);
			PQListmin.remove(idx1);
			PQListmin.remove(idx2);
			PQListmin.add(idx2, temp1);
			PQListmin.add(idx1, temp2);
		}
		else if (mode == 1)
		{
			Type temp1 = PQListmax.get(idx1);
			Type temp2 = PQListmax.get(idx2);
			PQListmax.remove(idx1);
			PQListmax.remove(idx2);
			PQListmax.add(idx2, temp1);
			PQListmax.add(idx1, temp2);
		}
		
	}
	public void add()
	{
		for(int i=(PQListmin.size()-2)/2; i >=0 ; --i)
		{
			minHeapify(i);
			maxHeapify(i);
		}	
		
			
	}
	public void add(Type data)
	{
		PQListmin.add(data);
		PQListmax.add(data);
		int current = PQListmin.size();
		int parent = (current-1)/2;
		while(true)
		{
			 if(compare(PQListmin.get(current),PQListmin.get(parent)))
			 {
				 swap(current,parent,0);
				 current=parent;
			 }
			 else
				 break;
		}
		while(true)
		{
			 if(compare(PQListmax.get(parent),PQListmin.get(current)))
			 {
				 swap(current,parent,1);
				 current=parent;
			 }
			 else
				 break;
		}
	}
	public void remove(Type data)
	{
		PQListmin.remove(data);
		PQListmax.remove(data);
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
		int smallest,left,right;
		while(true)
		{
			smallest=idx;
			left = idx*2 +1 ;
			right = (idx+1)*2;
			if (left < PQListmin.size() && compare(PQListmin.get(left),PQListmin.get(smallest)) )
			{
				smallest = left;
			}
			if (right < PQListmin.size()) 
			{
				if (compare(PQListmin.get(right),PQListmin.get(smallest)) )
					smallest = right;
			}
			if (smallest != idx)
			{
				swap(smallest,idx,0);
				idx=smallest;
			}
			else
				break;
		}
	}
	public void maxHeapify(int idx)
	{
		int largest,left,right;
		while(true)
		{
			largest=idx;
			left = idx*2 +1 ;
			right = (idx+1)*2;
			if (left < PQListmax.size() && !compare(PQListmax.get(left),PQListmax.get(largest)) )
			{
				largest = left;
			}
			if (right < PQListmin.size() )
			{
				if(!compare(PQListmax.get(right),PQListmax.get(largest)))
					largest = right;
			}
			if (largest != idx)
			{
				swap(largest,idx,1);
				idx=largest;
			}
			else
				break;
		}
	}
}
