package Array;

public class quickSort {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		int n=a.length;
		quickSort qs = new quickSort();
		qs.quicksortest(a, 0,n-1);
		qs.print(a);
	}
	public int partition(int[] a, int low, int high)
	{
		int pivot  = a[(low+high)/2];
		while( low <= high)
		{
			while(a[low] < pivot)
			{
				low++;
			}
			while(a[high] > pivot)
			{
				high--;
			}
			while(low <= high)
			{
				int temp = a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
			return low;
		}
		return low;
	}
	public void quicksortest(int[] a, int low, int high)
	{
		int pi = partition( a,low,high);
		if(low < pi-1)
		{
			quicksortest(a, low, pi-1);
		}
		if(high > pi)
		{
			quicksortest(a, pi, high);
		}
	}
	void print(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
