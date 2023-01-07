package hackerRankCG;

import java.util.*;

public class CheckFrequencyInArray {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=checkFreq(arr);
		System.out.println(ret);
	}

	private static int checkFreq(int[] arr) {
		int[] nums=new int[647];
		int mid=arr.length/2;
		int ret=0;
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			nums[temp]++; 
			if(nums[temp]>mid) {
				ret= temp;
				break;
			}else {
				ret= -1;
			}
//			for(int j:nums) {
//				System.out.println(j);
//			}
			
		}
		return ret;
	}
}
