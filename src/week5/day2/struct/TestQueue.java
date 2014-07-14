package week5.day2.struct;

import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		IQueue queue = new QueueImpl();
		queue.enqueue("first");
		queue.enqueue("second");
		queue.enqueue("third");
		System.out.println(queue);
	}

}
