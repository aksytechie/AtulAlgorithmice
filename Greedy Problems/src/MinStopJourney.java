import java.util.ArrayList;

public class MinStopJourney {
	
    class Distance{
    	ArrayList<Integer> DI;
    	int M;
    	int N;
    	Distance(ArrayList<Integer> di,int n,int m)
    	{
    		DI = di;
    		M = m;
    		N = n;
    	}
    	int FindMinStops()
    	{
    		int dist=0;
    		int stops=0;
    		for(int i=0;i<N;++i)
    		{
    			dist = dist + DI.get(i);
    			if(dist < M && dist+DI.get(i+1)<M);
    			else
    			{	
    				stops++;
    				dist=0;
    			}
    				
    		}
    		return stops;
    	}
    }
    
	public static void main(String[] args) {
	ArrayList<Integer> dis = new ArrayList<Integer>();
	dis.add(5);
	dis.add(3);
	dis.add(6);
	dis.add(4);
	dis.add(7);
	Distance D = new Distance(dis, 5, 10);
	System.out.println("The minimum stops are :"+ D.FindMinStops());
	
	
	}

}
