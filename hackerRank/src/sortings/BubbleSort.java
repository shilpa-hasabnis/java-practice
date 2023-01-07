package sortings;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
