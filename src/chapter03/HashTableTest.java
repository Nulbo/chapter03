package chapter03;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
	public static void main( String[] args ) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		//map.put( "one", new Integer(1) );
		map.put( "one", 1 ); // auto boxing
		map.put( "two", 2 );
		map.put( "three", 3 );
		
		//Integer i = map.get( "one" );
		int i = map.get( "one" ); //auto unboxing
		System.out.println( i );

		map.put( "one", 4 );
		i = map.get( "one" );
		System.out.println( i );

		map.remove( "one" );
		Integer j = map.get( "one" );
		if( j != null ) {
			System.out.println( j );
		}
		
		
	}
}
