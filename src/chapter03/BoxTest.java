package chapter03;

public class BoxTest {
	public static <T, K> void test(T t, K k){
		System.out.println( t + ":" + k );
	}
	
	public static void main(String[] args) {
	
		test( new StringBuffer("Hello"), new Integer( 1 ) );
		
//		Box box = new Box();
//		box.setObject( "Hello" );
//		String s = (String)box.getObject();
		
		Box<String> box2 = new Box<String>();
		box2.setObject( "Hello" );
		String s1 = (String)box2.getObject();
		
	
	}

}
