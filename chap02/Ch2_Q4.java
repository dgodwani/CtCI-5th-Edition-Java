package LinkedList;

public class Ch2_Q4 {

	public static Node arrangeList(Node node, int x) {

		if (node == null)
			return null;
		Node firstHalf = null;
		Node laterHalf = null;
		Node firstHalfHead = null;
		Node laterHalfHead = null;

		while (node != null) {
			Node next = node.next;
			if (node.data <= x) {
				if (firstHalf == null) {
					firstHalf = node;
					firstHalfHead = firstHalf;
				} else {
					firstHalf.next = node;
					firstHalf = node;
				}
				firstHalf.next = null;
			} else {
				if (laterHalf == null) {
					laterHalf = node;
					laterHalfHead = laterHalf;
				} else {
					laterHalf.next = node;
					laterHalf = node;
				}
				laterHalf.next = null;
			}
			node = next;
		}
		firstHalf.next = laterHalfHead;
		return firstHalfHead;
	}
	public static void main(String[] args) {
		Node head = new Node(7);
		Node first = new Node(2);
		Node second = new Node(8);
		Node third = new Node(1);
		Node fourth = new Node(9);
		Node fifth = new Node(5);
		Node sixth = new Node(3);
		Node seventh = new Node(13);
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println("-- After Rearrangement--");
		node = arrangeList(head, 3);
		
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
