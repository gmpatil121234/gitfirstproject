package mvnId;

public class PracticeClass {
	String stName;
	int stdId;

	public void info() {
		stName="Ganesh";
	
	
}
	public void display() {
		System.out.println("Name :"+stName);
	}
	public static void main(String[] args) {
		
		PracticeClass obj =new PracticeClass();
		obj.info();
		obj.display();
		
	}

}
