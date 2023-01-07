package NScode;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class moveZeros {
	public static void main (String[] args) {
       // Your code here
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int j=0;j<number;j++) {
		int n = sc.nextInt();
		int[] arr=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			System.out.print(arr[i]+" ");
			count++;
			
		}
		}
		int num=n-count;

		for(int i=0;i<num;i++) {

			System.out.print("0"+" ");
		}
		System.out.println("");
		}
	}
}



