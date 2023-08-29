package Array;

public class MultiDimArray {

	public static void main(String[] args) {
//		int[][] a = new int[5][4];  // first declaration
//		int[][] b = new int[][] {{10,20,30},{50,60,80,90}}; // second declaration
//		int c[][];
//		c= new int[5][4];  // t]hird declaration
		int[][] d = {{10,20,30},{20,50},{80,90,70,50}}; // fourth declaration
		for(int r=0; r<d.length; r++)
		{
			for(int c=0; c<d[r].length; c++)
			{
				System.out.println(d[r][c]);
			}
		}
		System.out.println(d[2].length);
		for(int x[]:d)
		{
			for(int z:x)
			{
				System.out.println(z);
			}
		}
	}

}
