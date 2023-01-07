package dataStructures;

public class DeletemidLL {

	static class Node{
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node(int data, Node nextNode) {
			this.data = data;
			this.next = nextNode;
		}
	}

	public static void main(String[] args) {
//		Node h5= new Node(5);
		Node h4= new Node(4);
		Node h3= new Node(3,h4);
		Node h2= new Node(2,h3);
		Node h1= new Node(1,h2);

		print(h1);
		Node s= deleteMiddleElement(h1);
		print(s);
	} 

	public static Node deleteMiddleElement(Node head) {
		Node curr=head;
		Node h=head;
		Node k=head;
		Node inv= new Node(-1);

		int len=0;
		while(curr!=null){
			curr=curr.next;
			len++;
		}
		int mid=0;
		if(len%2==0){
			mid=(len+1)/2;
		}
		else if(len==1){
			return inv;
		}
		else{
			mid=len/2;
		}
		
		for(int i=1;i<len;i++){
			if(i==mid){
				h.next=h.next.next;
			}
				h=h.next;

		}
		return k;
	}
	private static void print(Node h1) {
		Node mov=h1;
		System.out.println(" ");
		while(mov!= null) {
			System.out.print(mov.data+" ");
			mov=mov.next;

		}		
		
	}

}



