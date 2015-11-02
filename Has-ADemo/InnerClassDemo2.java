class W
{
	int x = 100;
	interface TT{
		
	}
	class D
	{
		
	}
	class E extends D implements TT
	{
		int x = 200;
		class M{
			int x = 300;
			class T{
				int x = 400;
				T(int x){
				System.out.println(W.this.x + E.this.x + M.this.x + this.x +x);	
				}
			}
		}
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		W.E.M.T obj = new W().new E().new M().new T(100);
			
	}

}
