package chapter03;

public class LangClassTest {

	public static void main(String[] args) {
		Point point = new Point();
		
		// 기본 Object 구현 메서드 확인
		System.out.println( point );
		System.out.println( point.toString() );
		System.out.println( point.hashCode() );
		System.out.println( point.getClass().getName() );
		
		// ==, equals 차이점
		Point point2 = new Point( 2, 3 );
		Point point3 = new Point( 2, 3 );
		Point point4 = point2;
		
		System.out.println( point2 == point3 );
		System.out.println( point2 == point4 );

		System.out.println( point2.equals( point3 ));
		System.out.println( point2.hashCode() == point3.hashCode() );
	
		System.out.println( System.identityHashCode( point2 ) );
		System.out.println( System.identityHashCode( point3 ) );
		
	}
}
