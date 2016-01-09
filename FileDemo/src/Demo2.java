import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter{
	private String ext;
	MyFilter(String ext){
		this.ext = ext;
	}
	public boolean accept(File dir, String fileName){
		return fileName.endsWith(ext);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		File file = new File("D:\\FileTesting");
		File newName =null;
		int counter = 1;
		String ext = ".gif";
		//File files[]= file.listFiles(new MyFilter(ext));
		File files[]= file.listFiles((dir,name)->name.endsWith(ext));
		for(File f : files){
			if(f.isDirectory()){
				System.out.println("<DIR> "+f.getName());
			}
			else
				if(f.isFile())
			{
					/*newName = new File("D:\\FileTesting\\VirusFoundFile"+counter+".haha");
					f.renameTo(newName);
					counter++;*/
					//f.delete();
				System.out.println("<FILE>"+f.getName());
			}
		}

	}

}
