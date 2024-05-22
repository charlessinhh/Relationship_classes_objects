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
	
	
	
	
	
	
	
	
	public void insertAfterValue(int currentData, int newData) {
		Node temp = head;
		Node newNode = new Node(newData);
		
		while(temp != null && temp.data != currentData) {
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Node with "+currentData+ " not found");
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	
	
	
	
	
	
	public boolean searchNodeByKey(int key) {
		
		//search by key 
		Node temp = head;
		//traverse the list and find the key if found return true else false
		while(temp != null) {
			if(temp.data == key) {
				System.out.println("search by key " +key +" :- True");
				return true;
			}
			temp = temp.next;
		}
		System.out.println("search by key " +key +" :- False");
		return false;
	}
	
	
	
	
	
	
	public void deleteNodeByKey(int key) {
		
		Node temp = head;  //here temp will be found and delete from list
		Node prev = null; // to store prev node of temp. and pointing this prev to temp.next
		
		//if first node to be deleted means temp.data = key
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		//search the next node data ,,
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("key not found to delete");
			return;
		}
		//as temp reached the node of given key,, now delete the temp/key
		prev.next = temp.next;
		temp.next = null; // garbage collection
		System.out.println("Key "+key+" is deleted successfully.");
		
		//element not found to be deleted
		
		
	}
	
	
	
	
	
	
	
	
	//traversing the LinkedList and print the elements also
	public void traverseLinkedList() {
		//take a Node object that points to head and traverse through the list
//		System.out.println("head.data  "+head.data);
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
	
	
	public void findMiddleElement() {
		Node fastPointer = head;
		Node slowPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.println("Middle element of LinkedList : "+slowPointer.data); 
	}
	

}
