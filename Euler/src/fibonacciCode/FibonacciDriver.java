package fibonacciCode;

public class FibonacciDriver {

	static CountFibonacci runner = new CountFibonacci(4000000);
	public static void main(String[] args) {
		System.out.println(runner.getCount());
	}

}
