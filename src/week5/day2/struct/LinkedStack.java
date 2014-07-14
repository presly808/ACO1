package week5.day2.struct;

import java.util.Iterator;

import week5.day1.struc.IStack;

public class LinkedStack implements IStack, Iterable {

	private InnerNode top; // null
	
	@Override
	public void push(Object value) {
		// may be replaced by     top = new Node(value, top);
		if(top == null){
			InnerNode newNode = new InnerNode();
			newNode.setValue(value);
			newNode.setNext(null);
			top = newNode;
		} else {
			InnerNode newNode = new InnerNode();
			newNode.setValue(value);
			newNode.setNext(top);
			top = newNode;
		}
	
	}

	@Override
	public Object pop() {
		InnerNode temp = top;
		top = top.getNext();
		return temp.getValue();
	}
	
	
	
	@Override
	public Iterator iterator() {
		return new LinkedStackIterator();
	}



	private class LinkedStackIterator implements Iterator {

		private InnerNode iterNode = top;
		
		@Override
		public boolean hasNext() {
			return iterNode != null;
		}

		@Override
		public Object next() {
			Object temp = iterNode.getValue();
			iterNode = iterNode.getNext();
			return temp;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}

}
