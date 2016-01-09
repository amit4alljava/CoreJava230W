import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
    FileOutputStream fo = new FileOutputStream("D:\\FileTesting\\Sample.txt");
    String msg = "Hello How are You";
    fo.write(msg.getBytes());
    fo.close();
    System.out.println("Data Store...");
		/* FileInputStream fi = new FileInputStream("D:\\230WeekEndBatch\\FileDemo\\src\\ReadWriteDemo.java");
     int singleValue = fi.read();
     while(singleValue!=-1){
    	 System.out.print((char)singleValue);
    	 singleValue = fi.read();
     }
     int singleValue ;
     do{
    	 singleValue = fi.read();
    	 System.out.print((char)singleValue);
     }while(singleValue!=-1);
     fi.close();*/

	}

}
