package com.estsoft.paint.point;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println( now );
		//deprecated!
		System.out.println( now.getYear() + 1900 );
		
		SimpleDateFormat sdf = 
			new SimpleDateFormat( "yyyy년 MM월 dd일  hh:mm:ss" );
		
		System.out.println( sdf.format( now ));
	}

}
