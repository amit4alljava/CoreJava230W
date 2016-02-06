import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class PageReader {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		int singleChar = 0;
		URL url = new URL("http://techstory.in/wp-content/uploads/2015/02/sachin-tendulkar-sifr-651867782.jpg");
		URLConnection con = url.openConnection();
		con.connect();
		InputStream is = con.getInputStream();
		FileOutputStream fo = new FileOutputStream("C:\\Users\\arnav\\Desktop\\HTML\\img.jpg");
		singleChar = is.read();
		while(singleChar!=-1){
			fo.write(singleChar);
			//sb.append((char)singleChar); 
			singleChar = is.read();
			
		}
		is.close();
		
		//fo.write(sb.toString().getBytes());
		fo.close();
		System.out.println("Done...");
		
		
		
		
		
		
		//System.out.println(sb);
	}

}
