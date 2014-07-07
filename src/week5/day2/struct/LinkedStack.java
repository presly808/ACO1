package week5.day2.struct;

import week5.day1.struc.IStack;

public class LinkedStack implements IStack {

	private Node top; // null
	
	@Override
	public void push(Object value) {
		// may be replaced by     top = new Node(value, top);
		if(top == null){
			Node newNode = new Node();
			newNode.setValue(value);
			newNode.setNext(null);
			top = newNode;
		} else {
			Node newNode = new Node();
			newNode.setValue(value);
			newNode.setNext(top);
			top = newNode;
		}
	
	}

	@Override
	public Object pop() {
		Node temp = top;
		top = top.getNext();
		return temp.getValue();
	}

}
