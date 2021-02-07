package linkedlist;

public class Linkdlist<E> {


	Node<E> head;
	
	void add(E data) {
		Node toAdd = new Node(data);
		if(head == null) {
			head = toAdd;
			return ;
		}
		
		
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		
		
		
	}
	void reverse() {
		
		Node curr = head;
		Node next= null;
		Node prev = curr.next;
		
		while(prev != null) {
			
			curr.next = next;
			next = curr;
			curr= prev;
			prev = curr.next;
		}
		curr.next = next;
		System.out.println("linkedlist in reverse order");
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		
	}
	
	void print() {
		Node temp = head;
		System.out.println("list items");
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
		}
		
	}
	
	public static void main(String[] args) {
		Linkdlist<Integer> ll = new Linkdlist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.print();
		ll.reverse();
	}
}