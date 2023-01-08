public class Client {

	public static void main(String[] args) {
		
		myLinkedList list = new myLinkedList();
		
		list.addFirst(15);
		
		list.addFirst(10);
		
		list.addFirst(90);
		
		list.addFirst(555);
		
		list.removeFirst();
		
		System.out.println("Testing get and set");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println(list.set(1, 9876));
		System.out.println(list.get(1));
	
		System.out.println("Testing sum and removeLast");
		System.out.println(list.sum());
		
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		//System.out.println(list.removeLast());
		System.out.println(list.get(0)); // get(1) and get(2) should give errors
		
		// Test addLast
		System.out.println("Testing addLast and Zero");
		list.addLast(8);
		list.addLast(9);
		list.addLast(3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// Test zero
		list.zero();
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(2));
		
	}

}
