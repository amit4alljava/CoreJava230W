interface BEntry{
	public void show();
}
public class B implements BEntry {
@Override
	public void show(){
	System.out.println("B Show");
}
public void print(){
	System.out.println("B Print");
}
}
