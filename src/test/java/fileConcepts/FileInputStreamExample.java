package fileConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	
	public static void main(String[] args) throws IOException {
	
		
		File f = new File("./test.txt");
		
		FileInputStream fis = new FileInputStream(f);
		
		int asciCode;
		
		while((asciCode=fis.read()) != -1) {
		System.out.print((char)asciCode);
		
		} 
		
		
		fis.close();
	}

}
