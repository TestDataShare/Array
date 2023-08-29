package Array;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		//System.out.println(a.length);
		int temp=0;
		for(int i=0; i<a.length; i++) // no. of iterationi.e. number of time they will sort  //  10-1=9
		{
			int flag=0;
			for(int j=0; j<a.length-1-i; j++)  // for the array data columns mai leke data diya
			{
				if(a[j]>a[j+1])  // >== small to large ascending    < for descending
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag =1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	
	}

}
