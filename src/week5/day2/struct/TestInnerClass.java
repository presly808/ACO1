package week5.day2.struct;

public class TestInnerClass {

	public static void main(String[] args) {
		QueueImpl queueImpl = new QueueImpl();
		QueueImpl.InnerNode innerNode = queueImpl.new InnerNode();
	}

}
