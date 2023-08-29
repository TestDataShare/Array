package Array;

public class StringBubbleSort {

	public static void main(String[] args) {
		String[] a = {"Vishal","Madhuri","Swapnali","om","Lucky","Abhi"};
		//System.out.println(a.length);
		String temp=null;
		for(int i=0; i<a.length; i++) // no. of iterationi.e. number of time they will sort  //  10-1=9
		{
			int flag=0;
			for(int j=0; j<a.length-1-i; j++)  // for the array data columns mai leke data diya
			{
				if(a[j].compareTo(a[j+1])>0) // >== small to large ascending    < for descending
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
