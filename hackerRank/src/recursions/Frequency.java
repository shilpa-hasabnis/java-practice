package recursions;

import java.util.Scanner;
public class Frequency {
	public static int count;
	public static void main(String[] args) throws Exception {
	
		 Scanner sc = new Scanner(System.in); 
		 int n= sc.nextInt(); 
		 int[]arr= new int[n]; 
		 for(int i=0;i<n;i++)
		 { 
			 arr[i]=sc.nextInt(); 
		 } 
		 int d=sc.nextInt();
		 int co=freq(arr,0,d);
		System.out.println(co);
	}

	public static int freq(int[] arr, int idx,int d){
		
		if(idx==arr.length){
			return 0;
		}		
		
		freq(arr,idx+1,d);

		if(arr[idx] == d) {
				count++;
			}

		return count;
	}   
}