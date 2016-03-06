import java.util.ArrayList;
class DEPQTest{
	
	

	public static void main(String[] args) {
		DoubleEndedPriorityQueue<Integer> test = new DoubleEndedPriorityQueue<Integer>(){
			@Override
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
		test.add(2);
		test.add(7);
		test.add(1);
		test.add(5);
		test.add(10);
		
		Integer min = new Integer(test.getMax());
		System.out.println(min);
	}




}
