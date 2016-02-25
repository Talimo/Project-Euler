package find1000Fibinacci;

import java.math.BigInteger;

public class FindIt {

	private BigInteger num = new BigInteger("1");
	private BigInteger oldNum = new BigInteger("1");
	private BigInteger thous = new BigInteger("10").pow(1000);
	private boolean done = false;
	
	public void findFib(){
		BigInteger old;
		long place = 2;
		while(!done){
			if(num.compareTo(thous) >= 0){
				System.out.println(place);
				System.out.println(num);
				done = true;
			}
			else{
				old = num;
				num.add(oldNum);
				oldNum = old;
				place ++;
			}
		}
	}
}
