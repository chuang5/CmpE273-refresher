package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
	Queue<String> queue;
	public queue() {
		queue = new LinkedList<String>();
	}
	
	public String add(String s) {
		queue.add(s);
		return s;
	}
	
	public String remove(String s) {
		queue.remove(s);
		return s;
	}
	
	public String printQueue() {
		Iterator<String> it = queue.iterator();
		String queueStr = "";
		while (it.hasNext()) {
			String iteratorValue = (String) it.next();
			queueStr += iteratorValue + " ";
		}
		return queueStr;
	}
	
	public String poll() {
		String s = queue.poll();
		return s;
	}
	
	public String peek() {
		String s = queue.peek();
		return s;
	}
	
	public int size() {
		int i = queue.size();
		return i;
	}
	
	public static void main(String[] args) {

		queue object = new queue();

		object.add("adam");
		object.add("betty");
		object.add("cindy");
		object.add("daniel");
		object.add("eric");
		object.remove("daniel");

		System.out.println("Initial Size of Queue : " + object.size());
		
		System.out.println("Queue Value: " + object.printQueue());
		
		System.out.println("Queue peek : " + object.peek());
		
		System.out.println("Queue peek : " + object.poll());

		System.out.println("Queue Value: " + object.printQueue());

		System.out.println("Final Size of Queue : " + object.size());
	}
}
