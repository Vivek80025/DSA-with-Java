public class DeleteDuplicate{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	void delete(Node temp1){
		Node temp = head;
		while(temp.next != temp1){
			temp = temp.next;
		}
		temp.next = temp1.next;
	}
	void deleteDuplicate(){
		Node temp = head;
		while(temp.next != null){
			if(temp.data == temp.next.data){
				delete(temp.next);
			}
			else{
				temp = temp.next;
			}
		}
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
		DeleteDuplicate list = new DeleteDuplicate();
		list.insertAtEnd(1);
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.display();
		list.deleteDuplicate();
		System.out.println("after delete the duplicate: ");
		list.display();
	}
}