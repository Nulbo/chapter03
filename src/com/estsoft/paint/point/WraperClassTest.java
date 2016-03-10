package com.estsoft.paint.point;

public class WraperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer( 10 );
		System.out.println( i );
		
		Integer i2 = new Integer( "1000" );
		System.out.println( i2 );
		
		Integer i3 = 10;
//		Integer i3 = new Integer(10); //auto Boxing
		System.out.println( i3 );
		
		int i4 = i3 + 100;
//		int i4 = i3.intValue() + 100; //auto unboxing
		System.out.println( i4 );
		
		// literal pool
		Integer i10 = 100;
		Integer i20 = 100;
		
		System.out.println( i10 == i20 );
	}
}
