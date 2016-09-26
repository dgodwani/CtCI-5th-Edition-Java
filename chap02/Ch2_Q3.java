package LinkedList;

public class Ch2_Q3 {
	
	public static boolean deleteNode(Node n){
		if(n==null || n.next==null)
			return false;
		Node temp = n.next;
		n.data = temp.data;
		n.next = temp.next;
		return true;
	}

}
