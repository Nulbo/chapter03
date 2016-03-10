package com.estsoft.paint.point;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream( "123.txt");
			BufferedOutputStream bos =
					new BufferedOutputStream( fos, 5 );
			
			for( int i = '0'; i <= '9'; i++ ) {
//			for( int i = 48; i <= 57; i++ ) {
				bos.write( i );
				bos.flush(); 
			}
		
			bos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
