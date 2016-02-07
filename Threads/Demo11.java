import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//extends Thread
class Job  implements Runnable{
	private String fileName;
	Job(String fileName){
		this.fileName = fileName;
	}
	@Override
	public synchronized void run() {
		
		System.out.println("Thread Start "+Thread.currentThread());
		long startTime = System.currentTimeMillis();
		try {
			FileOutputStream fo 
			=new FileOutputStream("C:\\MyData\\"+fileName);
			BufferedOutputStream bo = 
					new BufferedOutputStream(fo,12000);
			FileInputStream fi 
			= new FileInputStream("C:\\MyData\\Test.dat");
			BufferedInputStream bi = 
					new BufferedInputStream(fi,12000);
			int singleChar = bi.read();
			while(singleChar!=-1){
				bo.write(singleChar);
				singleChar = bi.read();
			}
			fo.close();
			fi.close();
			//bi.close();
			//bo.close();
			long endTime = System.currentTimeMillis();
			System.out.println("File Done... "+Thread.currentThread());
			System.out.println("Time Taken "+(endTime-startTime));
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*for(int i = 1; i<=5 ; i++){
			System.out.println(" I is "+i
					+" Thread "+Thread.currentThread());
		}*/
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		Job job1 = new Job("test2.dat");
		//Job job2 = new Job("test3.dat");
		Thread worker1 = new Thread(job1,"ram");
		Thread worker2 = new Thread(job1,"shyam");
		worker1.start();
		worker2.start();
		//System.out.println(Thread.currentThread());

	}

}
