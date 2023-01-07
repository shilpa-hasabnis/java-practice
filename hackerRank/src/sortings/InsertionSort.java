package sortings;
import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(i=1;i<n;i++) {
			int key=a[i];
			j=i-1;
				while(j>=0 && key<a[j]) {
					a[j+1]=a[j];
					j=j-1;
				}
				a[j+1]=key;
			
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}
}
