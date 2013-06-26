package algorithm.list;

public class CyclicList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = Node.generateSingleLinkedList(new int[]{1,2,3,4,5,6,7,8,9});
		Node node10 = new Node(10);
		node.tail().next = node10;
		// 5
		//node10.next = node.next.next.next.next;
		System.out.println(isCyclicList(node));
	}
	
	public static boolean isCyclicList(Node node) {
		Node fast = node;
		Node slow = node;
		
		while(slow != null && fast != null && fast.next != null) {
			if(fast.next == slow)
				return true;
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return false;
	}
	
	public static Node findCyclicStartPoint(Node node) {
		Node joint = null;
		
		
		
		return joint;
	}
}
