package dataStructures;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Queuesmax {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> li= new ArrayList<Integer>();
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			int s=sc.nextInt();
			li.add(s);
		}


		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int mov= sc.nextInt();
			if(mov==1){
				int val=sc.nextInt();
				li.add(val);
			}else{
				System.out.println(Collections.max(li));
			}
		}
	}
}

