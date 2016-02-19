package fibonacciCode;

public class CountFibonacci {
	
	private int max;
	private int total = 0;
	
	
	public CountFibonacci(int x){
		max = x;
	}
	
	public int getCount(){
		int x = 2;
		int old1 = 1;
		int old2;
		while(x < max){
			if(x%2 == 0)
				total += x;
			old2 = x;
			x +=old1;
			old1 = old2;
		}
		return total;
	}
}
