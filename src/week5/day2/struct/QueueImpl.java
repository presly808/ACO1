package week5.day2.struct;

public class QueueImpl implements IQueue {
	
	private Node first;
	private Node last;
	
	
	@Override
	public void enqueue(Object value) {
		if(first == null){
			first = new Node(value, null);
			last = first;
		} else {
			Node newNode = new Node(value, last);
			last = newNode;
		}
		
		
	}
	
	
	@Override
	public Object dequeue() {
		return null;
	}
	
	
	
	
}
