package Array;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int b[] = {40,50,60,70,80};
		int a_len=a.length;
		int b_len= b.length;
		int[] c = new int[a_len+b_len];
		//System.out.println(c.length);
		for(int i =0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
	    for(int i=0; i<c.length; i++)
	    {
	    	System.out.println(c[i]);
	    }

	}

}
