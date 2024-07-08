package mar18th;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\HP\\Desktop\\Madan Java\\abc.txt");
		f.createNewFile();
		System.out.println("End of program...");

	}

}
