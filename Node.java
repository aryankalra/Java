public class Node {
	
	int data;
	Node next;
	
	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}
	
	public void setData(int data) {
		this.data=data;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
	public Node() {
		next = null;
		data = 0;
	}
	
	public Node(int data) {
		setData(data);
	}
	
	public Node(int data, Node next) {
		setData(data);
		setNext(next);
	}
}
