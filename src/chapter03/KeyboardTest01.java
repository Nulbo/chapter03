package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardTest01 {

	public static void main(String[] args) {
		try {
InputStreamReader isr =
		new InputStreamReader( System.in, "UTF-8" );	

BufferedReader br = new BufferedReader( isr );

			String line;
			while( (line = br.readLine()) != null ){
				System.out.println( line );
			}
			
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
