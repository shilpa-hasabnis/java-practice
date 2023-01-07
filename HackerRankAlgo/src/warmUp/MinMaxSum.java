package warmUp;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void miniMaxSum(List<Integer> arr) {
		long sum=0;
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
		}
		List <Long> li=new ArrayList<>();
		for(int j:arr){
			long temp=sum-j;
			li.add(temp);
		}
		System.out.print(Collections.min(li)+" ");
		System.out.print(Collections.max(li));


	}

}

public class MinMaxSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		Result.miniMaxSum(arr);

		bufferedReader.close();
	}
}
