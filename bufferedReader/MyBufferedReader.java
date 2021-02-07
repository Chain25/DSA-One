package bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("myFile.txt");
		FileReader fileOutputStream = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fileOutputStream);
		
		int count ;
		
		while( (count = br.read()) != -1) {
			System.out.println((char)count);
			
		}
		String name;
		while((name=br.readLine()) != null) {
			System.out.println(name);
		}
	
		br.close();
	}

}
