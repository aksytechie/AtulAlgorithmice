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
		test.PQListmax.add(2);
		test.PQListmax.add(5);
		test.PQListmax.add(1);
		test.PQListmax.add(7);
		test.PQListmax.add(6);
		test.PQListmin.add(2);
		test.PQListmin.add(5);
		test.PQListmin.add(1);
		test.PQListmin.add(7);
		test.PQListmin.add(6);
		test.add();
		Integer min = new Integer(test.getMax());
		System.out.println(min);
	}




}
