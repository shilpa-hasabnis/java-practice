package NScode;
import java.util.*;

public class MohitArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		int curr=0;
		int sum=n*(n+1)/2;
		for(int i=0;i<n-1;i++) {
			curr=curr+arr[i];
		}
		System.out.println(sum-curr);
	}
}
