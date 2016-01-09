import java.io.File;
import java.io.IOException;


public class Demo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\FileTesting");
		File newName =null;
		int counter = 1;
		File files[]= file.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				System.out.println("<DIR> "+f.getName());
			}
			else
				if(f.isFile())
			{
					newName = new File("D:\\FileTesting\\VirusFoundFile"+counter+".haha");
					f.renameTo(newName);
					counter++;
					//f.delete();
				System.out.println("<FILE>"+f.getName());
			}
		}
		/*String fileFolderNames[]  = file.list();
		for(String name: fileFolderNames){
			System.out.println(name);
		}*/
		//File file = new File("D:\\FileTesting\\aa\\bb\\cc\\dd");
		//file.mkdirs();
		//File file  = new File("D:\\FileTesting\\Test.txt");
		/*if(file.exists()){
			file.delete();
			System.out.println("File Deleted....");
		}
		else{
		file.createNewFile();
			System.out.println("File Created...");
		}*/
		}

	

}
