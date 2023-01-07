package hackerRankCG;


public class LinkedList {
	public static void main(String[] args) {
		IntList h4= new IntList(4);
		IntList h3= new IntList(3,h4);
		IntList h2= new IntList(2,h3);
		IntList h1= new IntList(1,h2);
		
		int len=checklen(h1);
		System.out.println(len);
	}

	private static int checklen(IntList h1) {
		int len=0;
		if(h1==null) {
			return -1;
		}else {
			while(h1!=null) {
				len++;
				h1=h1.next;
			}
		}
		return len;
	}
}
class IntList {
	public int value;
	public IntList next;

	public IntList(int value, IntList next) {
		this.value = value;
		this.next = next;
	}
	public IntList(int value) {
		this.value = value;
	}
}