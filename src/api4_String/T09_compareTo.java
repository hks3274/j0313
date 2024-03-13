package api4_String;

import java.util.Objects;

public class T09_compareTo {
	public static void main(String[] args) {
		// compareTo :
		String str = "Seoul";
		str += "/Busan";
		str += "/Chungju";

		System.out.println("str : " + str);
		System.out.println();

		String a = "Seoul";
		String b = "seoul";
		String c = a + b; //SeoulSeoul

		System.out.println("c : " + c);
		System.out.println();

//		System.out.println(a>b);// 이런 개념은 사용할 수 없음 //그래서 compareTo라는 문자비교가 나옴
		// compareTo() : 문자열 비교 메소드(0 : 동일자료일때, 음수: 앞의 문자열이 뒤의 문자열보다 작을때 , 양수: 앞의 문자열이 뒤의 문자열보다 클때) 
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		System.out.println();
		
		//공백비교 : equals(), isBlank(): 한번 쓰고 지웠을때, isEmpty() : 아무것도 없을때
		System.out.println("1.c가 공백? " + c.equals(""));
		System.out.println("2.c가 공백? " + c.equals(" "));
		System.out.println("3.c가 공백? " + c.isBlank());
		System.out.println("4.c가 공백? " + c.isEmpty());
		System.out.println();
		
		String d = "";
		System.out.println("1.d가 공백? " + d.equals(""));
		System.out.println("2.d가 공백? " + d.equals(" "));
		System.out.println("3.d가 공백? " + d.isBlank());
		System.out.println("4.d가 공백? " + d.isEmpty());
		System.out.println("5.d가 공백? " + Objects.isNull(d));
		
		
		
	}
}
