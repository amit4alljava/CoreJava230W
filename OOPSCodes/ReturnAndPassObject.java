class PrgStudent
{
	int rollno;
	String name;
	PrgStudent(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
}
class PrintJob
{
	void printStudentInfo(int rollno, String name){
		rollno++;
		System.out.println("Rollno "+rollno);
		System.out.println("Name "+name);
	}
	void printStudentInfo(PrgStudent student){
		student.rollno++;
		System.out.println("Rollno "+student.rollno);
		System.out.println("Name "+student.name);
	}
}
public class ReturnAndPassObject {

	public static void main(String[] args) {
		PrgStudent studentObj = new PrgStudent(1001, "Ram");
		PrintJob job = new PrintJob();
		//int x = 1001;
		//job.printStudentInfo(x, "Ram");
		//System.out.println("Now New Rollno is "+x);
		job.printStudentInfo(studentObj);
		System.out.println("Now New Rollno is "+studentObj.rollno);

	}

}
