public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public int removeFirst() {
		int removed = head.getData();
		head = head.getNext();
		return removed;
	}

	public void addFirst(int data) {
		Node n = new Node(data,head);
		head = n;
	}

	public int get(int idx) {
		Node current = head;
		
		for(int i = 0; i<idx; i++) {
			current = current.getNext();
		}
		return current.getData();
	}
	
	public int set(int idx, int data) {
		Node current = head;
		
		for(int i = 0; i<idx; i++) {
			current = current.getNext();
		}
		int rem = current.getData();
		current.setData(data);
		
		return rem;
	}
	
	public int sum() {
		Node current = head;
		int sum = 0;
		while(current!=null) {
			sum += current.getData();
			current = current.getNext();
		}
		
		return sum;
	}
	
	public int removeLast() {
		
		if(head.getNext()==null) {
			int rem = head.getData();
			head=null;
			return rem;
		}
		
		Node current = head;
		
		while(current.getNext().getNext()!=null) {
			current = current.getNext();
		}
		
		int rem = current.getNext().getData();
		current.setNext(null);
		return rem;
	}
	
	public void zero() {
		Node current = head;
		
		while(current!=null) {
			current.setData(0);
			current = current.getNext();
		}
		
	}
	
	public void addLast(int data) {
		
		if(head.getNext()==null) {
			Node n = new Node(data,null);
			head.setNext(n);
			return;
		}
		
		Node current = head;
		
		while(current.getNext().getNext()!=null) {
			current = current.getNext();
		}
		Node n = new Node(data,current.getNext());
		current.setNext(n);
		
	}

}
