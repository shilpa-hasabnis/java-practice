package hackerRankCG;
public class QueueElevator {
	public static void main(String[] args) {
		int[] A={60,80,40}; //{40,100,80,20};
		int[] B= {3,2,2,3};
		int x=2 ,y=200; //x=5;
		System.out.println(solution(A,B,x,y));

	}
	private static int solution(int[] a, int[] b, int x/*capacity*/, int y/*tol weight*/) {
		int wei=a[0];
		int stop=2;
		int i=0,n=0;
		for(i=1 ;i<a.length; i++) {
			if( n<=x && wei+a[i-1]<=y) {
				wei+=a[i-1]; 
				stop++;
				n++;
				int next=wei+a[i];
				if(next>y) {
					wei=0;
					stop++;
					n=0;
				}
			}
		}
		return stop;
	}
}