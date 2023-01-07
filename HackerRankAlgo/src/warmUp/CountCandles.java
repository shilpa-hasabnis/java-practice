package warmUp;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Resul{

	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int count=0;
		int max=Collections.max(candles);
		for(int i:candles){
			if(max==i){
				count++;
			}
		}
		return count;
	}

}

public class CountCandles {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> candles = new ArrayList<>();

		for (int i = 0; i < candlesCount; i++) {
			int candlesItem = Integer.parseInt(candlesTemp[i]);
			candles.add(candlesItem);
		}

		int result = Resul.birthdayCakeCandles(candles);

		System.out.print(result);

		bufferedReader.close();
	}
}


