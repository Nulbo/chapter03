package chapter03;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader( 
				"./src/chapter03/BufferedReaderTest.java" );
			BufferedReader br = new BufferedReader( fr );
			
			int index = 1;
			String line;
			while( (line = br.readLine()) != null ){
				System.out.println( index + ":" + line );
				index++;
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}