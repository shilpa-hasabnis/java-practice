package arrays;
import java.util.*;
public class SumArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int s=sc.nextInt();
		int[] arr= new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		Solution obj=new Solution();
		ArrayList <Integer> news= obj.subarraySum(arr, num, s);
		for(int j : news) {
			System.out.print(j+" ");
		}
	}
}

	class Solution
	{
	    //Function to find a continuous sub-array which adds up to a given number.
	    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	    	  ArrayList <Integer> li=new ArrayList<>();
	          for(int i=0;i<n;i++){
	              int sum=arr[i];
	              for(int j=1;j<n;j++){
	              if(sum==s){
	                  li.add(i);
	                  li.add(j);
	              }
	              if(sum>s|| j==n){
	                  break;
	              }
	              sum=sum+arr[i];
	              }
	          }
	          return li;
	      }
	}