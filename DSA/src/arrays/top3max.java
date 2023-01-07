package arrays;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class top3max {
	public static void main (String[] args) {
		// Your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			int[] arr=new int[num];
			for(int j=0;j<num;j++){
				arr[j]=sc.nextInt();
			}
			
			
			int temp=arr[0];
			int temp1=arr[0];
			int temp2=arr[0];


			for(int k=1;k<num;k++){
				if(temp<arr[k]){
					temp=arr[k];
				}
			}
			for(int a=1;a<num;a++){
				if(arr[a]>=temp1&& arr[a]<temp){
					temp1=arr[a];
				}
			}
			for(int b=1;b<num;b++){
				if(arr[b]>=temp2 && arr[b]<temp1){
					temp2=arr[b];
				}
			}
			System.out.println(temp+" "+temp1+" "+temp2);

		}

	}
}
//3
//5
//1 4 2 4 5
//6
//1 3 5 7 9 8
//7
//11 22 33 44 55 66 77