public class AddList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	void reverse(){
		Node prev = null;
		Node curr = head;
		while(curr != null){
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}
	public static AddList addList(AddList list1,AddList list2){
		AddList list = new AddList();
		list1.reverse();
		list2.reverse();
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		int carry = 0;
		while(temp1 != null || temp2 != null || carry != 0){
			int val1 = 0;
			int val2 = 0;
			if(temp1 != null){
				val1 = temp1.data;
				temp1 = temp1.next;
			}
			if(temp2 != null){
				val2 = temp2.data;
				temp2 = temp2.next;
			}
			int sum = carry + val1 + val2;
			list.insertAtEnd(sum%10);
			carry = sum/10;
		}
		list.reverse();
		return list;
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
		AddList list1 = new AddList();
		AddList list2 = new AddList();
		list1.insertAtEnd(4);
		list1.insertAtEnd(5);
		list2.insertAtEnd(3);
		list2.insertAtEnd(4);
		list2.insertAtEnd(5);
		System.out.print("1st linkedlist: ");
		list1.display();
		System.out.print("2nd linkedlist: ");
		list2.display();
		AddList list = addList(list1,list2);
		System.out.print("addition of 1st and 2nd linkedlist is : ");
		list.display();
		
	}
}