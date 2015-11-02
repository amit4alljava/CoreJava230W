class Student{
	Student(){
		System.out.println("Student Cons Call");
	}
	class LibCard{
		LibCard(){
			System.out.println("LibCard Cons Call");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Student.LibCard l = 
				new Student().new LibCard();
		//Student s = new Student();
		//Student.LibCard l = s.new LibCard();
		

	}

}
