package algorithm.list;

public class ReverseSingleList {
	public static Node header;
	
	public static void main(String[] args) {
		Node node = Node.generateSingleLinkedList(new int[]{1,2,3,4,5,6,7});
		node.print();
		System.out.println("Reverse List:");
//		reverseSingleList(node);
//		header.print();
		reverseSingleListNoRecursive(node).print();
	}
	
	public static Node reverseSingleList(Node node) {
		if(node.next == null)
			return header = node;
		
		Node newHeader = reverseSingleList(node.next);
		newHeader.next = node;
		node.next = null;
		
		return node;
	}
	
	public static Node reverseSingleListNoRecursive(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			
			curr.next = prev;
			prev = curr;
			
			curr = next;
		}
		
		return prev;
	}
}
