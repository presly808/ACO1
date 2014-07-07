package week5.day1.gen.task_1;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray<String> array = new MyArray<String>(20);
		array.add("Sergiy");
		array.add("Anton");
		array.add("Bogdan");
		
		array.sort();
		
		array.showAll();
	}

}
