package LinkedList;

public class Ch2_Q5 {
	
	public static Node add(Node first,Node second){
		
		Node result = null;
		Node resultHead = null;
		boolean isCarry = false;
		
		while(first!=null && second != null){
			int sum = first.data + second.data;
			if(isCarry)
				++sum;
			if(sum>=10){				
			    sum = sum -10;
			    isCarry = true;
			}else{
				isCarry = false;
			}
			if(result == null){
				result = new Node(sum);
				resultHead = result;
			}else{
				result.next = new Node(sum);
				result = result.next;
			}
			first = first.next;
			second = second.next;
		}
		
		if(first != null){
			if (isCarry) {
				first.data++;
			}
			result.next = first;
			isCarry = false;
		} 
		if(second != null){
			if (isCarry) {
				second.data++;
			}
			result.next = second;
			isCarry = false;
		}
		if(isCarry)
			result.next = new Node(1);
		return resultHead;
	}
	
	public static void main(String[] args) {
		Node f1 = new Node(1);
		Node f2 = new Node(6);
		Node f3 = new Node(4);
		f1.next = f2;
		f2.next = f3;
		
		Node s1 = new Node(3);
		Node s2 = new Node(5);
		Node s3 = new Node(8);
		Node s4 = new Node(7);
		s1.next = s2;
		s2.next = s3;
		s3.next = s4;
		Node node = add(f1, s1);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

}
