package largestPrime;

import java.math.BigInteger;

public class FindLargestPrime {
	private BigInteger num = new BigInteger("600851475143");
	private BigInteger current = new BigInteger("600851475143");
	private boolean done = false;
	private boolean isPrime = true;


	
	public void findLargePrime(){
		while(!done){
			
			for(BigInteger x = new BigInteger("2"); x != new BigInteger(""+ current.divide(new BigInteger("2"))) ; x.add(new BigInteger("1")) ){
				if((current.mod(x)) == (new BigInteger("0"))){
					isPrime = false;
					System.out.println("wrong");
					
					break;
				}

			}
			if(isPrime){
				if(num.mod(current) == (new BigInteger("0")));{
					System.out.println(current);
					break;
				}
			}
			else{
				isPrime = true;
				current.subtract(new BigInteger("1"));
				System.out.println("This is wrong");
			}
		}
	} 
	public void findLargestPrime2(){
		if(current.isProbablePrime(0)){
			if(current.mod(num) == new BigInteger("0")){
				System.out.println(current);
			}
		}
		else{
			current.subtract(new BigInteger("1"));
		}
	}
}
