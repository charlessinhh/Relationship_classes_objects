package linkedList_Operation;

public class LinkedList {
	
	Node head;
	
	//insert at the begin
	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		// newNode will point to head as currently head is pointing to the rest of list
		if(head != null) {
			newNode.next = head;
		}
		
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
	
	//insert after a given current node
	public void insertAfterNode(Node currentNode, int newData) {
		Node newNode = new Node(newData);
		
		System.out.println("currentNode.data "+currentNode.data);
		//edge case if currentnode is null
		if(currentNode == null) {
			System.out.println("CurrentNode can't be null");
			return ;
		}
		//point the next 
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		
		
	}
	
	public void insertAfterValue(int currentValue, int newData) {
		Node temp = head;
		Node newNode = new Node(newData);
		
		while(temp != null && temp.data != currentValue) {
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Node with "+currentValue+ " not found");
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	public boolean searchNode(int key) {
		
		Node temp = head;
		while(temp != null) {
			if(temp.data == key) return true;
			temp = temp.next;
		}
		return false;
	}
	
	//traversing the LinkedList and print the elements also
	public void traverseLinkedList() {
		//take a Node object that points to head and traverse through the list
		System.out.println("head.data  "+head.data);
		Node current = head;
		
		System.out.print("head -> ");
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		//to print last element points to null
		System.out.print("null");
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegin(5);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtEnd(10);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtEnd(20);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtEnd(30);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
//		list.insertAfterNode(list.head,12);
		list.insertAfterValue(30, 35);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtEnd(40);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtBegin(6);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		System.out.println("seacrh by key data : "+list.searchNode(6));
	}

}
