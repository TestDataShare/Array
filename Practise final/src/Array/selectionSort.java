package Array;

public class selectionSort {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		int min;
		int temp;
		for(int i=0; i<a.length; i++)	
		{
			min=i;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j] < a[min])  // for string a[j].compareTo(a[min]) <0
				{
					min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for( int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
