package arrays;
import java.util.*;

public class IceCream {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] menu=new int[n];
		for(int i=0;i<n;i++) {
			menu[i]=sc.nextInt();
		}
		int amm=sc.nextInt();
		int[] indx= choices(menu,n,amm);
		for(int i=0;i<indx.length;i++) {
			System.out.print(indx[i]+" ");
		}
	}

	private static int[] choices(int[] menu, int n, int amm) {
		int[] sortedmenu=menu.clone();
		Arrays.sort(sortedmenu);
		for(int i=0;i<n;i++) {
			int comp=amm-sortedmenu[i];
			int ind1=Arrays.binarySearch(sortedmenu, i+1, n, comp);
			if(ind1>=0 && ind1<=n && sortedmenu[ind1]==comp) {
				int[] ret= findpos(sortedmenu[ind1],sortedmenu[i],menu);
				return ret;
			}
		}
		return null;
	}

	private static int[] findpos(int i, int j, int[] menu) {
		int a=indx(i,menu);
		int b=indx(j,menu);
		int[] ars= {Math.min(a, b),Math.max(a, b)};
		return ars;
	}

	private static int indx(int k, int[] menu) {
		int rets=0;
		for(int i=0;i<menu.length;i++) {
			if(menu[i]==k) {
				rets=i;
			}
				
		}
		return rets;
	}
}