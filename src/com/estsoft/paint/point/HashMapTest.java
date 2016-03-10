package com.estsoft.paint.point;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
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
		
		//Key Set 가져오기
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while( it.hasNext() ) {
			String s = it.next();
			System.out.println( 
			"key:" + s + 
			",data:" + map.get( s ) );
		}
	}

}
