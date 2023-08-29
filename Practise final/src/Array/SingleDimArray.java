package Array;

public class SingleDimArray {

	public static void main(String[] args) {
		int[] a;    // initilization
		a= new int[5];  // declaration
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		a[4]=60;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i] + " ");
		}
		for(int x:a)
		{
			System.out.println(x);
		}
		int[] j = {10,20,30,40,50};
		int[] k = new int[4];
		int[] g = new int[] {10,20,30,40};
		
	}

}
