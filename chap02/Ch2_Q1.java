package LinkedList;

public class Ch2_Q1 {

	public static void removeDups(Node head) {

		if (head != null) {

			Node current = head;
			while (current != null) {
				Node runner = current;
				while (runner.next != null) {
					if (current.data == runner.next.data) {
						runner.next = runner.next.next;
					} else {
						runner = runner.next;
					}
				}
				current = current.next;
			}

		}
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
		System.out.println("-- After duplicates are removed--");
		removeDups(head);
		node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
