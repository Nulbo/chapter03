package com.estsoft.paint.point;

public class FormatterTest {

	public static void main(String[] args) {
		String name = "안대혁";
		int score = 100;
		
		String s =
			String.format( "%s님의 점수는 %d입니다.", name, score );
	}

}
