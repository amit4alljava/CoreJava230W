class MyLogic
{
	static int x = 1;
	static void print(){
		for(int i = 1 ; i<=5 ; i++,x++){
			/*Thread.currentThread().isAlive();
			Thread.currentThread().stop();
			Thread.currentThread().suspend();
			Thread.currentThread().resume();*/
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Thread.yield();
			//Thread.currentThread().setDaemon(true);
			System.out.println("Current Thread name "
					+ ""+Thread.currentThread().getName()+" I is "+i+" X "+x);
		}
	}
}

class Job2 implements Runnable
{
	int x = 100;
	MyLogic object = new MyLogic();
	@Override
	//public synchronized void run(){
	public  void run(){
		//System.out.println("Not Synch "+Thread.currentThread().getName());
		synchronized (MyLogic.class) {
			MyLogic.print();
		}
		//synchronized (object) {
		//	object.print();
		//}
		/*System.out.println("this is not synchronized ..."+Thread.currentThread());
		System.out.println("this is not synchronized ..."+Thread.currentThread());
		System.out.println("this is not synchronized ..."+Thread.currentThread());
		synchronized (this) {
			
			for(int i = 1 ; i<=5 ; i++,x++){
				System.out.println("Current Thread name "
						+ ""+Thread.currentThread().getName()+" I is "+i+" X "+x);
			}	
		}*/
		//System.out.println("Not Synch2 "+Thread.currentThread().getName());
		
	}
}
public class JoinAndSynchExample {

	public static void main(String[] args) throws InterruptedException {
		Job2 job = new Job2();
		Thread worker1 = new Thread(job,"worker1");
		Thread worker2 = new Thread(job,"worker2");
		Thread worker3 = new Thread(job,"worker3");
		//worker1.isAlive();
		worker1.start();
		//worker1.setDaemon(true);
		//worker1.sleep(1000);
		//worker1.join();
		worker2.start();
		worker3.start();
	}

}
