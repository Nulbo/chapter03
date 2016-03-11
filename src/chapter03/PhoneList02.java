package chapter03;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		try {
			File file = new File( "phone.txt" );
			if( file.exists() == false ) {
				System.out.println( "파일이 존재하지 않습니다." );
				return;
			}			
			
			Scanner scanner = new Scanner( file );

			System.out.println( "********파일 정보**********" );
			System.out.println( file.getAbsolutePath() );
			System.out.println( file.length() + " Bytes");
			System.out.println( new SimpleDateFormat( "yyyy-MM-dd a hh:mm:ss" ).format( new Date( file.lastModified() ) ) ); 

			System.out.println( "********전화번호 리스트**********" );			
			while( scanner.hasNextLine() ) {
//				String line = scanner.nextLine();
//				System.out.println( line );
				String name = scanner.next();
				int num01 = scanner.nextInt();
				int num02 = scanner.nextInt();
				int num03 = scanner.nextInt();
				
System.out.println( 
	"이름:" + name + 
	"\t\t" + 
	"전화번호:" + num01 + 
	"-" + num02 + 
	"-" + num03 );
			}
		
		
		
			scanner.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
