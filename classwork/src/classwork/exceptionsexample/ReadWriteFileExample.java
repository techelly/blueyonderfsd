package classwork.exceptionsexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteFileExample {
	
	public int readAnyFile() {
		File file = new File ("abc.txt");
		int s = 0;
		try {
			s = readTextFile(file);
		} catch (FileNotFoundException | ArithmeticException ae) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			ae.printStackTrace();
			System.out.println("File does not exists and calculation error");
		}catch(IOException io) {
			System.out.println("");
		}
		return s;
	}
	
	public int readTextFile(File file) throws IOException{
		FileInputStream fis = new FileInputStream(file);
		int s1 = fis.read();
		return s1;
	}
}
