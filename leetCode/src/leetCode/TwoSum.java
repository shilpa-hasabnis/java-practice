package leetCode;
import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		int[] nums={1,2,3,4,5};
		int target=4;
		int[] ns=twoSum(nums,target);
		for(int i=0;i<ns.length;i++) {
			System.out.println(ns[i]);
		}
	}
	
        public static int[] twoSum(int[] nums, int target) {
            int[] ret=new int[2];
            int[] numc=nums.clone();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++){
                int ind=Arrays.binarySearch(nums, i+1, nums.length, target-nums[i]);
                if(ind>i && ind<nums.length && nums[ind]==target-nums[i]){
                    int j=0;
                    int val=nums[i];
                    int dal=nums[ind];
                    for(int k=0;k<numc.length;k++){
                        if(val==numc[k]||dal==numc[k]){
                            ret[j]=k;
                            j++;
                        }
                    }     
                }
            }
            return ret;
        }
}
