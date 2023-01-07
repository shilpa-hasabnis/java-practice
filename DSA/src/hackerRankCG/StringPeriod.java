package hackerRankCG;

public class StringPeriod {
	public static void main(String[] args) {
		int[] n= {1,1,1,0,1,1,1,0,1,1};
		System.out.println(Solution.solution(n));
		
	}
	static class Solution {
	    static int solution(int[] n) {
	       int p;
	       int size=n.length;
	        for (p = 1; p < 1 + size; ++p) { //1-> 10+1>>11
	            int i;
	            boolean ok = true;
	            for (i = 0; i < size - p; ++i) {//10-1 
	                if (n[i] != n[i + p]) {
	                	System.out.print(n[i]+" ");
	                    ok = false;
	                    break;
	                }
	            }
	            if (ok) {
	                return p;
	            }
	        }
	        return -1;
	    }
	}

}


//This Works Just for Binary 
