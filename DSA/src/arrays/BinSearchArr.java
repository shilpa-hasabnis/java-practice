package arrays;
import java.util.*;
public class BinSearchArr {
public static void main(String[ ] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int key=sc.nextInt();
	int ind=bin(arr,0,n-1,key);
	System.out.println(ind);
}


public static int bin(int[] arr,int start,int end,int key) {
	int mid=(start+end)/2;
	if(arr[mid]==key) {
		return mid;
	}
	if(arr[mid]>arr[start]&&arr[mid]<arr[end]) {
		if(arr[start]<=key&&arr[mid]>=key) {
			return bin(arr,0,mid-1,key);
		}
		return bin(arr,mid,end-1,key);
	}
	return 0;
}}