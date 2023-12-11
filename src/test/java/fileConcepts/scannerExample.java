package fileConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scannerExample {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("./testdata1.txt");
		f.createNewFile();
		Scanner sc = new Scanner(f);
		
		
		
	System.out.println(sc.nextLine());
		
	}

}
