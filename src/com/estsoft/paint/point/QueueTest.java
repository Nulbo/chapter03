package com.estsoft.paint.point;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		 //List<String> list = new LinkedList<String>();
		 Queue<String> queue = new LinkedList<String>();
		
		 queue.offer( "둘리" );
		 queue.offer( "마이콜" );
		 queue.offer( "길동" );
		 
		 String s = queue.poll();
		 System.out.println( s );
		 System.out.println( queue.size() );
	
		 s = queue.peek();
		 System.out.println( s );
		 System.out.println( queue.size() );
		 
		 queue.poll();
		 queue.poll();
		 System.out.println( queue.size() );

		 
	}

}
