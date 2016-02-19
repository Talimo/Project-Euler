package smallestMultiple;

public class SmalMulti {

	private boolean done = false;
	private int current = 1;
	
	public int findSmallMullti(){
		int totalFound = 0;
		while(!done){
			for(int x = 1; x <= 20; x++){
				if(current % x == 0){
					totalFound++;
				}
				else{
					break;
				}
			}
			if(totalFound == 20){
				done = true;
			}
			else{
				totalFound = 0;
				current++;
			}
			
		}
		return current;
		
	}
}
