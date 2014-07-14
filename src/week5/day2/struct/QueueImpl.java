package week5.day2.struct;

public class QueueImpl implements IQueue {
	
	private InnerNode first;
	private InnerNode last;
	
	
	@Override
	public void enqueue(Object value) {
		if(first == null){
			first = new InnerNode(value, null, null);
			last = first;
		} else {
			InnerNode newNode = new InnerNode(value, last, null);
			last.next = newNode;
			
			last = newNode;
		}
		
		
	}
	
	
	@Override
	public Object dequeue() {
		return null;
	}


	@Override
	public String toString() {
		InnerNode temp = first;
		String res = "";
		while(temp != null){
			res += temp.value + ", ";
			temp = temp.next;
		}
		
		
		return "Queue [" + res + "]";
	}
	
	
	// inner class
	public class InnerNode {
		
		Object value;
		InnerNode prev;
		InnerNode next;
		
		public InnerNode(Object value, InnerNode prev, InnerNode next) {
			super();
			this.value = value;
			this.prev = prev;
			this.next = next;
		}

		public InnerNode() {
			super();
			
		}
		
		
		
	}
	
	
	
}
