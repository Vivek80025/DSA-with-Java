import java.util.*;
public class QueueUsingStack{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	public static void enqueue(int data){
		s1.push(data);
	}
	public static int dequeue(){
		if(s1.empty() && s2.empty()){
			System.out.println("queue is empty");
			return;
		}
		while(!s1.empty()){
			s2.push(s1.pop());
		}
		int ele = s2.pop();
		while(!s2.empty()){
			s1.push(s2.pop());
		}
		return ele;
	}
	public static void main(String[] args){
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println("deleted element is: "+q.dequeue());
		System.out.println("deleted element is: "+q.dequeue());
	}
}