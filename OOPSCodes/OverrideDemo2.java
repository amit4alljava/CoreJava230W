class T11
{
	int x , y , z;
}
class T12 extends T11
{
	int m,n,p;
}
class K3{
	
}

class C1
{
	T11 show(){
		T11 obj = new T11();
		obj.x = 100;
		obj.y = 200;
		obj.z= 300;
		return obj;	
	}
}
class C2 extends C1
{
	@Override
	T12 show(){
		T12 obj = new T12();
		obj.x = 1001;
		obj.y = 2001;
		obj.z= 300;
		obj.m=2332;
		obj.n=999;
		obj.p=777;
		return obj;	
	}
}
public class OverrideDemo2 {

	public static void main(String[] args) {
		C2 obj = new C2();
		T12 t = obj.show();
		t.x = 99999;
		System.out.println(t.x);
	}

}
