public class LinkedList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	//method to insert a node at last.
	void insertAtLast(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	//method to insert a node at first.
	void insertAtFirst(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	//method to insert a node at any location or position.
	void insertAtMiddle(int data,int location){
		//if location is: 3,insert a node after 3rd node
		Node newNode = new Node(data);
		Node prevNode = head;
		for(int i=1;i<location && prevNode != null;i++){
			prevNode = prevNode.next;
		}
		if(prevNode == null){
			System.out.println("previous node can't contain null value(wrong input insertion location)");
			return;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	//method to delete a node.
	void deleteNode(int position){
		Node temp = head;
		for(int i=1;i<position-1 && temp!=null;i++){
			temp = temp.next;
		}
		if(temp==head){
			head = temp.next;
			return;
		}
		if(temp==null || temp.next==null){
			System.out.println("wrong input deletion position");
			return;
		}
		temp.next = temp.next.next;
	}
	//method to reverse a linkedList iteratively.
	void reverse(){
		Node prev = null;
		Node curr = head;
		while(curr!=null){
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}
	//method to reverse a linkedlist recursively.
	void reverseRecursively(Node curr,Node prev){
		if(curr==null){
			return;
		}
		if(curr.next==null){
			curr.next = prev;
			head = curr;
			return;
		}
		Node forward = curr.next;
		curr.next = prev;
		prev = curr;
		curr = forward;
		reverseRecursively(curr,prev);
	}
	//method to find middle node.
	void middleNode(){
		if(head==null){
			System.out.println("empty linkedlist");
			return;
		}
		if(head.next==null){
			System.out.println("middle node of linkedlist is: "+head.data);
			return;
		}
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("middle node of linkedlist is: "+slow.data);
	}
	//method for print a linkedlist
	void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println(" null");
	}
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.insertAtLast(1);
		list.insertAtLast(2);
		list.insertAtLast(3);
		list.insertAtLast(4);
		list.insertAtLast(5);
		list.display();
		//insert at middle : after 3rd position
		list.insertAtMiddle(9,3);
		//insert at first 
		list.insertAtFirst(10);
		list.display();
		//delete a node
		list.deleteNode(1);
		list.display();
		//reverse a linkedlist
		list.reverse();
		list.display();
		list.reverseRecursively(list.head,null);
		list.display();
		list.middleNode();
	}
}