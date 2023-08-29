package Array;

public class deleteAnElement {

	public static void main(String[] args) {
		int[] a = {90,50,70,30,20,80,10,40,60,5};
		int del_ele= 30;
		for(int i=0; i<a.length; i++)
		{
			if(del_ele == a[i])
			{
				for(int j=i; j<a.length-1; j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int i=0; i<a.length-1; i++)
		{
			System.out.println(a[i]);
		}

	}

}
