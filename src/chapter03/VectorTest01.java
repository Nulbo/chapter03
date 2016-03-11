package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {
	
	//1.2  Collection Framework가 나오기 전
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		
		vector.addElement( "둘리" );
		vector.addElement( "고길동" );
		vector.addElement( "마이콜" );
		
		vector.removeElementAt( 2 );
		
		//순회1
		int size = vector.size();
		for( int i = 0; i < size; i++ ) {
			String s = vector.elementAt( i );
			System.out.println( s );
		}
		
		//순회2
		Enumeration<String> e = vector.elements();
		while( e.hasMoreElements() ) {
			String s = e.nextElement();
			System.out.println( s );
		}
		
	}

}
