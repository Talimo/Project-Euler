package countingCastles;

public class Count {

	private int height, width, count;
	int[] blocks;
	int [][]  castle;
	
	Count(int h, int w){
		height = h;
		width = w;
	}
	
	public void initalizeArray(){
		blocks = new int[width];
		for(int x = 0; x < width; x++){
			blocks[x] = x +1;
		}
	}
	public int castleCount(){
		castle = new int[width-1][height-1];
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				if()
			}
		}
		return 0;
	}
	
}
