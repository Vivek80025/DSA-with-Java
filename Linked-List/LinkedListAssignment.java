public class LinkedListAssignment{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	boolean searching(int key){
		Node temp = head;
		while(temp != null){
			if(temp.data == key){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	void insertAtspecificLoc(int data,int loc){
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=1;i<loc;i++){
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	void insertAtEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
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
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args){
		LinkedListAssignment list = new LinkedListAssignment();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		list.display();
		System.out.println(list.searching(3));
		list.insertAtspecificLoc(3,4);
		list.display();
	}
}