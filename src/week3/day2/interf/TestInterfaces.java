package week3.day2.interf;

public class TestInterfaces {

	public static void main(String[] args) {
		
		Company company = new Company();
		Univercity univercity = new Univercity();
		
		Worker worker = new Worker();
		Student student = new Student();
		
		company.testWorker(worker);
		univercity.testStudent(student);
		
		SuperMan superMan = new SuperMan();
		company.testWorker(superMan);
		univercity.testStudent(superMan);
		
		
		
	}
}
