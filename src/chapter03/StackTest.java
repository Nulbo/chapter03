package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push( "둘리" );
		stack.push( "마이콜" );
		stack.push( "길동" );
		
		String s = stack.pop();
		System.out.println( s );
		System.out.println( stack.size() );
		
		s = stack.peek();
		System.out.println( s );
		System.out.println( stack.size() );
		
		stack.pop();
		stack.pop();
		System.out.println( stack.size() );

		if( stack.isEmpty() == false ) {
			stack.pop();
		}
		
	}

}
