import java.util.*;
public class StackUsingQueue{
	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();
	public static void push(int data){
		while(!q1.isEmpty()){
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()){
			q1.add(q2.poll());
		}
	}
	public static int pop(){
		if(q1.isEmpty()){
			System.out.println("stack underflow");
			System.exit(0);
		}
		return q1.poll();
	}
	public static void main(String[] args){
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("deleted element is: "+stack.pop());
		System.out.println("deleted element is: "+stack.pop());
	}
}