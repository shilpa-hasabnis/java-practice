package NScode;
import java.util.*;

public class ArrayFrequency {
	public static void main(String[] args) {
		// Your code 
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		for(int i=1;i<=n;i++) { //two cycles

			int num=sc.nextInt();
			int[] arr= new int[num];
			//int[] arrr= new int[4];

			for(int j=0;j<num;j++) { //input arr
				arr[j]=sc.nextInt();
			}	

			for(int k =0;k<num;k++) { // iterate through arr 
				if(k%2==0) {	//find odd index
					for(int j=0;j<arr[k];j++) { //iterate odd index number times
						//		System.out.println(arr[k]+" ");
						System.out.print(arr[k+1]+" ");
					}
				}
			}

			System.out.println("");
		}

	}
}