public class PalindromeLL{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	Node tail;
	void reverse(Node mid){
		Node temp = head;
		while(temp.next != mid){
			temp = temp.next;
		}
		Node prev = temp;
		Node curr = mid;
		while(curr != null){
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		tail = prev;
	}
	Node findMid(){
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	boolean checkPalindrome(){
		if(head==null || head.next==null){
			return true;
		}
		Node mid = findMid();
		reverse(mid);
		Node start = head;
		Node end = tail;
		while(start != mid){
			if(start.data != end.data){
				return false;
			}
			start = start.next;
			end = end.next;
		}
		return true;
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
		PalindromeLL list = new PalindromeLL();
		list.insertAtEnd(1);
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(1);
		// list.insertAtEnd(1);
		list.display();
		System.out.println(list.checkPalindrome());
	}
}