package linkedList_Operation;

public class LL_Operation {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegin(5);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtEnd(10);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtBegin(45);
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
		list.insertAtEnd(80);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtEnd(90);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.insertAtBegin(6);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.searchNodeByKey(10);
		list.searchNodeByKey(15);
		list.searchNodeByKey(20);
		list.deleteNodeByKey(5);
		System.out.println("LinkedList: ");
		list.traverseLinkedList();
		list.findMiddleElement();
	}
}
