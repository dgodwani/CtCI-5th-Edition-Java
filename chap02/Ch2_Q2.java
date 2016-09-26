package LinkedList;

public class Ch2_Q2 {

	public static Node getKtotheLastElement(Node head, int k) {

		if (head == null)
			return null;

		Node result = head;
		Node runner = head;

		for (int i = 0; i < k - 1; i++) {
			if (runner != null) {
				runner = runner.next;
			}
		}

		if (runner == null)
			return null;

		while (runner.next != null) {
			result = result.next;
			runner = runner.next;
		}
		return result;
	}

	public static void main(String[] args) {
		Node head = new Node(3);
		Node first = new Node(5);
		Node second = new Node(8);
		Node third = new Node(5);
		Node fourth = new Node(9);
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println("-- K to the last element is --");
		node = getKtotheLastElement(head, 3);
		System.out.println(node.data);
	}
}
