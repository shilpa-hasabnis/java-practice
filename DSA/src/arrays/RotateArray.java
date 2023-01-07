package arrays;
import java.util.*;
public class RotateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RotateArray rot=new RotateArray();
		int num= sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int diff=sc.nextInt();
		rot.rotate(arr,diff,num);
		rot.print(arr,num);
	}
	private void print(int[] arr, int num) {
		for(int k=0;k<num;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	private void rotate(int[] arr,int diff,int num) {
		for(int i=0;i<diff;i++) {
			rotateby(arr,num);
		}
	}
	private void rotateby(int[] arr, int num) {
		int temp=arr[0];
		for(int j=0;j<num-1;j++) {
			arr[j]=arr[j+1];
		}	
		arr[num-1]=temp;

	}
}
