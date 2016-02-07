class A
{
	static void disp(){
		for(int i = 1; i<=5 ; i++){
			System.out.println("Thread "+Thread.currentThread().getName()+" Value "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void print(){
		for(int i = 1; i<=5 ; i++){
			System.out.println("Thread "+Thread.currentThread().getName()+" Value "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SynchJob implements Runnable
{
	
	
	
	A obj = new A();
	@Override
	public  void run(){
		synchronized (this) {
			for(int i = 1; i<=5 ; i++){
				System.out.println("Thread "+Thread.currentThread().getName()+" Value "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (obj) {
			obj.print();
		}
		synchronized (A.class) {
			A.disp();
		}
	}
}
public class SynchDemo1 {

	public static void main(String[] args) throws InterruptedException {
		/*Job job = new Job();
		Thread worker1 = new Thread(job,"ram");
		Job job2 = new Job();
		Thread worker2 = new Thread(job2,"shyam");
		Job job3 = new Job();
		Thread worker3 = new Thread(job3,"sohan");
		worker1.start();
		worker2.start();
		worker3.start();*/
		/*worker1.start();
		worker1.join();
		worker2.start();
		worker2.join();
		worker3.start();*/
		
		
		
		

	}

}
