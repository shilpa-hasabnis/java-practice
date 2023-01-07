package dataStructures;

public class LinkedList {
	static class Node{
		public int data;
		public Node nextNode;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
		}

		public Node(int data, Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
	}

	public static void main(String[] args) {
		Node h4= new Node(4);
		Node h3= new Node(3,h4);
		Node h2= new Node(2,h3);
		Node h1= new Node(1,h2);
		
		print(h1);
		System.out.println("==============================================");
		Node s= deleteNode(h1,3);
		print(s);
		System.out.println("==============================================");

	} 
	
	private static Node deleteNode(Node h, int data) {
	
		try {
		
		
		  if(data==h.data) { 
			  h=h.nextNode; 
			  return h; 
			  }
		 
			Node curr= h;
		 
		while(curr!=null && curr!= curr.nextNode) {
			if(data == curr.nextNode.data) {
				curr.nextNode=curr.nextNode.nextNode;
				break;
			}
			curr=curr.nextNode;
		}
		}catch(Exception e) {
			System.out.println("Deleted 1st node");
		}
		return h;

	}
	private static void print(Node h1) {
		Node mov=h1;
		while(mov!= null) {
			System.out.println(mov.data);
			mov=mov.nextNode;

		}		
	}

}

