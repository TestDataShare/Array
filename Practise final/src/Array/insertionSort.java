package Array;

public class insertionSort {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		int temp, j;
		for(int i=1; i<a.length; i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
			
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
