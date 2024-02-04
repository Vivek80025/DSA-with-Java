public class CycleDetection{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	void insertAtEnd(int data){
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
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	//Floyd's cycle finding algorithms.
	void cycleDetection(){
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				System.out.println("the linkedlist has a loop");
				return;
			}
		}
		System.out.println("the linkedlist has no loop");
	}
	public static void main(String[] args){
		CycleDetection l1 = new CycleDetection();
		l1.insertAtEnd(1);
		l1.insertAtEnd(2);
		l1.insertAtEnd(3);
		l1.insertAtEnd(4);
		l1.insertAtEnd(5);
		l1.insertAtEnd(6);
		// l1.display();
		// l1.cycleDetection();
		//make a loop in a linkedList.
		Node temp = l1.head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = l1.head.next;
		l1.cycleDetection();
	}
}