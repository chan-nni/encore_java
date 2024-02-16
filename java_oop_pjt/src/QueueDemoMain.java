/*
먼저 들어간 데이터가 먼저 나오는 FIFO(Enqueue, Dequeue)
*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoMain {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(10); queue.offer(20); queue.offer(30); queue.offer(40);
		
		System.out.println("peek   : " + queue.peek());
		
		System.out.println("poll   : " + queue.poll()); // poll 은 데이터가 없으면 Exception 이 아닌 null값이 들어간다.
		System.out.println("size   : " + queue.size());
		
		System.out.println("remove : " + queue.remove());
		System.out.println("size   : " + queue.size());
		
		System.out.println("clear   : ");
		queue.clear();
		System.out.println("size   : " + queue.size());
		
		System.out.println("main end");

	}

}
