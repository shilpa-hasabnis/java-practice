package hackerRank;


	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class heightofBuilding {
		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			ArrayList<Integer> li= new ArrayList<>();
			int n=sc.nextInt();
			int ind=0;
			for(int i=1;i<=n;i++){
				int val=sc.nextInt();
				li.add(val);
			}

			/*
			 * int max=li.stream().max(Comparator.comparing(Integer::valueOf)).get(); int
			 * ind=li.indexOf(max); System.out.println(ind+1);
			 */
			for(Integer j:li){
				if(j<=j+1){
				ind=li.indexOf(j);
				System.out.println(ind);
				}
				else {
					break;
				}
			}
			//System.out.println(ind+1);

		}

	}
