package leetCode;

import java.util.Arrays;
import java.util.*;
class ContainsDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums= new int[n];
		for(int i =0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.print(containsDuplicate(nums));
	}
    public static boolean containsDuplicate(int[] nums) {
        System.out.println(nums.length);
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
        	if(nums[i]==nums[i+1]) {
        		return true;
        	}
        }
        return false;
    }
}