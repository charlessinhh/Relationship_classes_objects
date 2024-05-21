package linkedList_Operation;

public class LinkedList {
	
	Node head;
	
	//insert at the begin
	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		// newNode will point to head as currently head is pointing to the rest of list
		newNode.next = head;
		//now point head to newNode to insert it at begin
		head = newNode;
	}
	
	
	//insert at the last
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		
		//check if head is pointing to null means no element exist,,so add the newNode at head.
		if(head == null) {
			head = newNode;
			return;
		}
		// now add at end using temp ref point ,, traverse till last where temp.next == null
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		// temp reached the last element..now add the newNode to temp's next.
		newNode.next = null;
		temp.next = newNode;
		
	}
	
	
	//traversing the LinkedList and print the elements also
	public void traverseLinkedList() {
		//take a Node object that points to head and traverse through the list
		Node current = head;
		System.out.print("head -> ");
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		//to print last element points to null
		System.out.print("null");
		
	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegin(5);
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtBegin(6);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
	}

}
