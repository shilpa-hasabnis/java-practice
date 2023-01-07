package hackerRankCG;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {
	public static List<Integer> counts(List<Integer> teamA, List<Integer> teamB) {
		List<Integer>ret=new ArrayList<>();
	    int i=0,count=0,n=0;
	    Collections.sort(teamA);
	    Collections.sort(teamB);
	   for(int j=0;j<teamA.size()-1;j++){
	       if(teamB.get(i)>teamA.get(j)){
	            count++;
	            n++;
	       }else{      
	           i++;
	           j=0;
	           ret.add(count);
	       }
	   }
	    ret.add(count);

	    return ret;
	    }
	}

public class FootBallScores {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int teamACount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> teamA = new ArrayList<>();

		for (int i = 0; i < teamACount; i++) {
			int teamAItem = Integer.parseInt(bufferedReader.readLine().trim());
			teamA.add(teamAItem);
		}

		int teamBCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> teamB = new ArrayList<>();

		for (int i = 0; i < teamBCount; i++) {
			int teamBItem = Integer.parseInt(bufferedReader.readLine().trim());
			teamB.add(teamBItem);
		}

		List<Integer> result = Result.counts(teamA, teamB);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(String.valueOf(result.get(i)));

			
		}


		bufferedReader.close();
	}
}

