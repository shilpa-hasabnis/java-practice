package hackerRankCG;

public class SingleSwap {

	public static void main(String[] args) {
		int[] a= {1,5,3,3,7};
		boolean test= swaps(a);
		System.out.print(test);
	}

	private static boolean swaps(int[] a) {
		int j=0,i=1;
			for(j=0 ; j<a.length-1 && i>0; j++) {
				if(a[j]<a[j+1]) {
					int temp= a[j];
					a[j+1]=a[j];
					a[j]=temp;
				i--;
			}
		}
		for(i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
	}

}
