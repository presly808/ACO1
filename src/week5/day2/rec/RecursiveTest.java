package week5.day2.rec;

public class RecursiveTest {

	public static int fact(int n) {
		if(n < 2) return 1;
		
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		int num = 5;
		fact(num);

	}
	
}
