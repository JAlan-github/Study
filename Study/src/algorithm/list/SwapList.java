package algorithm.list;

public class SwapList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = Node.generateSingleLinkedList(new int[]{1,2,3,4,5,6,7,8});
		node.print();
		swapList(node).print();
	}
	
	public static Node swapList(Node node) {
		if(node == null || node.next == null)
			return node;
		
		Node prev = null;
		Node curr = node;
		Node next = node.next;
		Node header = node.next;
		
		while(curr != null && next != null) {
			curr.next = next.next;
			if(prev != null)
				prev.next = next;
			next.next = curr;
			
			prev = curr;
			curr = curr.next;
			next = (curr == null)?null:curr.next;
		}
		
		return header;
	}
}
