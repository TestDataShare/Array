package Array;

public class ThreeDimArray {

	public static void main(String[] args) {
		int[][][] a = {{{10,20,30},{40,50}},{{60,70,80},{90,100}}}; // anonymous array=  array has no name use only once then no use
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					System.out.println(a[i][j][k]);
				}
			}
		}
		for(int x[][]:a)
		{
			for(int z[]:x)
			{
				for(int g: z)
				{
					System.out.println(g);
				}
			}
		}

	}

}
