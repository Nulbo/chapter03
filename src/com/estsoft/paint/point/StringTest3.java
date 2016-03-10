package com.estsoft.paint.point;

public class StringTest3 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		
		System.out.println( s.charAt( 2 ) );
		System.out.println( s.indexOf( "abc" ));
		System.out.println( s.indexOf( 'A' ) );
		System.out.println( s.indexOf( "abc", 8 ));
		System.out.println( s.length() );
		System.out.println( s.replaceAll( "a", "R" ) );
		System.out.println( s.substring( 5 ) );
		System.out.println( s.substring( 0, 3 ) );
		
		
		String s1 = " abc";
		String s2 = ",efg ";
		
		s1 = s1.concat( s2 );
		System.out.println( "---" + s1 + "---" );
		
		s1 = s1.trim();
		System.out.println( "---" + s1 + "---" );
		
		String[] a = s1.split( "," );
		for( String tok : a ) {
			System.out.println( tok );
		}
		
		char[] ca = s1.toCharArray();
		System.out.println( ca );
		
		System.out.println( s1.toUpperCase() );
	}

}
