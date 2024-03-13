package api4_String;

import java.io.UnsupportedEncodingException;

//파일 업로드 다운로드 할 때 자주 사용함
public class T04_getBytes {
	public static void main(String[] args) {
		//아스키코드: 영문1글자 => 1byte, 한글 : 2byte;
		//EUC-KR : 영문 1byte, 한글 2Byte (10년전 까지부터 사용)
		//유니코드 : UTP-8 영문 1byte, 한국 3Byte (중국어 , 일본어 등등 영어제외 모든 글자 3Byte) 
		String str1 = "안녕하세요!"; //java에서는 1byte
		String str2 = "Hello!"; 
		
		System.out.println("str1의 길이 : "+ str1.length());
		System.out.println("str2의 길이 : "+ str2.length());
		
		byte[] b1 = str1.getBytes(); // 통신 할때는 bit 단위 => 그래서 가장 작은 단위 사용
		//통신을 보낼때 byte단위로 쪼개야하는데 이걸 도와주는 것이 getBytes이다.
		System.out.println("b1의 길이 : "+b1.length); //3byte 한글 5개 (3*5)+1 = 16
		
		byte[] b2 = str2.getBytes(); 
		System.out.println("b2의 길이 : "+b2.length);
		System.out.println();
		
		//인코딩/디코딩(복호화 할려면 문자로 만들어줘야 함)
		try {
		//EUC-KR
			//한글 인코딩 <-> 디코딩
			byte[] b3 = str1.getBytes("EUC-KR");
			System.out.println("b3의 길이 : "+b3.length);
			System.out.println("b3 : "+b3.toString()); //toString 생략가능함 
			System.out.println("b3[0] : "+b3[0]); //'안'이라는 코드의 EUC-KR코드는 -66
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~~~");
			String str3 = new String(b3, "EUC-KR"); //디코딩 하는 것 
			System.out.println();
			System.out.println(str3);
			
			//영문 인코딩 <-> 디코딩 
			byte[] b4 = str2.getBytes("EUC-KR"); //인코딩
			//디코딩 
			System.out.println("b4의 길이 : "+b4.length);
			System.out.println("b4 : "+b4.toString()); //toString 생략가능함 
			System.out.println("b4[0] : "+b4[0]); //'안'이라는 코드의 EUC-KR코드는 -66
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~~~");
			String str4 = new String(b4, "EUC-KR"); //디코딩 하는 것 
			System.out.println();
			System.out.println(str4);
			System.out.println("==================================================");
			//UTF-8
			//한글 인코딩 <-> 디코딩
			b3 = str1.getBytes("UTF-8");
			System.out.println("b3의 길이 : "+b3.length);
			System.out.println("b3 : "+b3.toString()); //toString 생략가능함 
			System.out.println("b3[0] : "+b3[0]); //'안'이라는 코드의 EUC-KR코드는 -66
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~~~");
			str3 = new String(b3, "UTF-8"); //디코딩 하는 것 
			System.out.println();
			System.out.println(str3);
			
		//영문 인코딩 <-> 디코딩 
			 b4 = str2.getBytes("UTF-8"); //인코딩
			//디코딩 
			System.out.println("b4의 길이 : "+b4.length);
			System.out.println("b4 : "+b4.toString()); //toString 생략가능함 
			System.out.println("b4[0] : "+b4[0]); //'안'이라는 코드의 EUC-KR코드는 -66
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~~~");
			str4 = new String(b4, "UTF-8"); //디코딩 하는 것 
			System.out.println();
			System.out.println(str4);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		
		
	}
}
