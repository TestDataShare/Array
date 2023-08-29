package Array;

public class insertElement {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		int pos = 5;
		int ele=800;
		for(int i=a.length-1; i>pos-1 ;i--)
		{
			a[i]=a[i-1];
		}
		a[pos]=ele;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
