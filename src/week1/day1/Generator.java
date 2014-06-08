package week1.day1;

public class Generator {
	
	public static String genPass(int size){
		String res = "";
	
		for(int i = 0; i <= size; i++){
			int group = (int)(Math.random() * 3);
			
			int charNum = 0;
			if(group == 0){
				charNum = 48 + (int)(Math.random() * 10);
			} else if (group == 1){
				charNum = 65 + (int)(Math.random() * 26);
			} else {
				charNum = 97 + (int)(Math.random() * 26);
			}
			
			res += (char)charNum;
			
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println(genPass(19));
	}
	
}
