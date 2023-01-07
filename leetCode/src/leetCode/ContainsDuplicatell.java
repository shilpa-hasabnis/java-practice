package leetCode;

import java.util.*;
public class ContainsDuplicatell {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums= new int[n];
		for(int i =0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.print(containsNearbyDuplicate(nums,k));
	}
	    public static boolean containsNearbyDuplicate(int[] nums, int k) {
	       int[] num=nums.clone();
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++){
	        	if(nums[i]==nums[i+1]) {
	        		return checkidx(nums[i],num,k);
	        	}
	        }
	        return false;
	    }
	    
	    public static boolean checkidx(int val,int[] num,int k){
	        int val1=linsearch(0,val,num);
	        int val2=linsearch(val1+1,val,num);
	        //int q = Math.abs(val1-val2);
	        if(val2-val1<=k){
	            return true;
	        }
	        return false;
	    } 
	    public static int linsearch(int start, int val,int[] num){
	        for(int i=start;i<num.length;i++){
	            if(num[i]==val){
	                return i;
	            }
	        }
	        return -1;
	    }
	}


