package hackerRankCG;
import java.util.*;
public class SaddlePoint {

	public static void main(String[] args) {
		int[][] arr= {{0,1,9,3},{7,5,8,3},{9,2,9,4},{4,6,7,1}};
		int ret=sadle(arr);
		System.out.println(ret);
	}

	private static int sadle(int[][] arr) {
		int i=0;int j=0,ret=0;
		for(i=1; i< arr.length-1; i++) {
            for(j=1; j< arr[i].length-1; j++) {
            	if((arr[i-1][j]<arr[i][j]&&arr[i][j]>arr[i+1][j])&&(arr[i][j-1]>arr[i][j]&&arr[i][j]<arr[i][j+1])||(arr[i-1][j]>arr[i][j]&&arr[i][j]<arr[i+1][j])&&(arr[i][j-1]<arr[i][j]&&arr[i][j]>arr[i][j+1])) {
            	ret++;
            	}
            }
		}
		return ret;
	}

}
