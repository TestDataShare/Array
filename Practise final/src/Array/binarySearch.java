package Array;

public class binarySearch {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		int item = 200;
		int li=0;
		int hi=a.length-1;
		int mi = (li+hi)/2;
		while(li<=hi)
		{
			if(a[mi]==item)
			{
				System.out.println("item is mateched");
				break;
			}
			else
			if(a[mi] < item)
			{
				li=mi+1;
			}
			else if(a[mi] > item)
			{
				hi= mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li> hi)
		{
			System.out.println("item is not found");
		}

	}

}
