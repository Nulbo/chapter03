package com.estsoft.paint.point;

public class WrapperClassTest {

	public static void main(String[] args) {
		System.out.println( Character.isDigit( 'c' ) );
		System.out.println( Character.isDigit( '1' ) );
	
		int i = Character.getNumericValue( '1' );
		System.out.println( i );
		
		System.out.println( Integer.parseInt( "12345" ) );
		System.out.println( Integer.parseInt( "ff", 16 ) );
		System.out.println( Integer.toHexString( 12345 ) );
		System.out.println( Double.parseDouble( "2.145343" ) );
	}

}
