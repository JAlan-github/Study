package algorithm.list;

public class ListLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = Node.generateSingleLinkedList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		System.out.println(getListLength(node));
		System.out.println(findMiddleValue(node));
	}

	public static int getListLength(Node node) {
		int n = 0;

		while (node != null) {
			n++;
			node = node.next;
		}

		return n;
	}

	public static double findMiddleValue(Node node) {
		
		Node fast = node;
		Node slow = node;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			
			if(fast.next == null)
				return slow.next.data;
			
			if(fast.next.next == null)
				return Double.parseDouble(slow.data + slow.next.data + "") / 2;
			
			slow = slow.next;
		}
		
		return -1d;
	}

}
