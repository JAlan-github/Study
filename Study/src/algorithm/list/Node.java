package algorithm.list;

public class Node {
	public int data;
	public Node prev;
	public Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public static Node generateSingleLinkedList(int[] data) {
		if(data.length == 0 || data == null)
			return null;
		else if(data.length == 1)
			return new Node(data[0]);
		else {
			Node header = new Node(data[0]);
			Node curr = header;
			for(int i=1; i<data.length; i++) {
				curr.next = new Node(data[i]);
				curr = curr.next;
			}
			
			return header;
		}
	}
	
	public void print() {
		Node temp = this;
		
		while(temp != null) {
			System.out.print(temp.data);
			if(temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	public Node tail() {
		Node temp = this;
		
		while(temp.next != null)
			temp = temp.next;
		
		return temp;
	}
}
