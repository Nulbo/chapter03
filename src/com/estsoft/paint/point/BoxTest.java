package com.estsoft.paint.point;

public class BoxTest {

	public static void main(String[] args) {
		
//		Box box = new Box();
//		box.setObject( "Hello" );
//		String s = (String)box.getObject();
		
		Box<String> box2 = new Box<String>();
		box2.setObject( "Hello" );
		String s1 = (String)box2.getObject();
		
	}

}
