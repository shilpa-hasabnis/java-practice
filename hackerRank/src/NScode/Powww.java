package NScode;
import java.io.*; // for handling input/output
import java.util.*; 
import java.lang.Math;// contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Powww {
	public static void main (String[] args) {
		Scanner scn= new Scanner(System.in);
		int T= scn.nextInt();
		for(int i=0; i<=T; i++){
			
			double X = scn.nextDouble();
			int N = scn.nextInt();

			double ans=0.0;
			ans= Math.pow(X,N);
			System.out.printf("%.2f ",ans);
			/*
			 * System.out.println("");
			 */		}
	}
}