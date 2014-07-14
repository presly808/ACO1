package week5.day2.struct;

public class InnerNode {
	
	private Object value;
	private InnerNode next;
	private InnerNode prev;
	
	
	
	public InnerNode() {
		super();
	}

	public InnerNode(Object value, InnerNode prev, InnerNode next) {
		super();
		this.value = value;
		this.next = next;
		this.prev = prev;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public InnerNode getNext() {
		return next;
	}

	public void setNext(InnerNode next) {
		this.next = next;
	}

	public InnerNode getPrev() {
		return prev;
	}

	public void setPrev(InnerNode prev) {
		this.prev = prev;
	}
	
	
	
	
	
}
