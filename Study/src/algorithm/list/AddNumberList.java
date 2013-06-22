package algorithm.list;

public class AddNumberList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node number1 = Node.generateSingleLinkedList(new int[]{6,1,7});
		Node number2 = Node.generateSingleLinkedList(new int[]{4,8,2});
		
		number1.print();
		number2.print();
		addNumberLists(number1, number2).print();
	}
	
	public static Node addNumberLists(Node number1, Node number2) {
		Node curr = new Node(-1);
		Node header = curr;
		int carry = 0;
		int val1, val2;
		
		while(number1 != null || number2 != null) {
			val1 = (number1 == null)?0:number1.data;
			val2 = (number2 == null)?0:number2.data;
			
			curr.next = new Node((val1 + val2 + carry) % 10);
			carry = (val1 + val2 + carry) / 10;
					
			curr = curr.next;
			number1 = (number1 == null)?null:number1.next;
			number2 = (number2 == null)?null:number2.next;
		}
			
		if(carry > 0)
			curr.next = new Node(1);
		
		return header.next;
	}
}
