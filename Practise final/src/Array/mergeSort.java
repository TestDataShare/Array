package Array;

public class mergeSort {
	int[] temp;
	int[] arr1;
	int length;

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		mergeSort ms = new mergeSort();
		ms.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	public void sort(int a[])
	{
		this.arr1= a;
		this.length=a.length;
		this.temp=new int[length];
		divide(0, length-1);
	}
	public void divide(int lowerindex, int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middle=lowerindex+(higherindex-lowerindex)/2;
			divide(lowerindex, middle);
			divide(middle+1, higherindex);
			merge(lowerindex, middle, higherindex);
		}
	}
	public void merge(int lowerindex, int middle, int higherindex)
	{
		for(int i=lowerindex; i<=higherindex; i++)
		{
			temp[i]=arr1[i];
		}
		int i=lowerindex;
		int j= middle+1;
		int k=lowerindex;
		while(i<=middle && j<=higherindex)
		{
			if(temp[i]<=temp[j])
			{
				arr1[k]=temp[i];
				i++;
			}
			else
			{
				arr1[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			arr1[k]=temp[i];
			i++;
			k++;
		}
		
	}
	

}
