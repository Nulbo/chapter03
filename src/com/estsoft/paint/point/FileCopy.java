package com.estsoft.paint.point;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream( "profile.jpg" );
			FileOutputStream fos = new FileOutputStream( "profile.bak.jpg" );
		
			int data = -1;
			while( (data = fis.read()) != -1 ) {
				fos.write( data );
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e ){
			e.printStackTrace();
		}
	}
}
