package api4_String;

/*
 * => 면접질문 : mutable(가변) / immuteble(불가변) 이란?
 * 
 * String 객체: 불가변 - immuterble로써 class로서 한번 크기가 생성된 값을 그 값을 유지하게 된다. 짧은 문자열길이에 적합
 * StringBuffer 객체: muterble객체로써 크기를 변경할 수 있다. ==> 동기화를 제공한다., multiThread를 제공/ 사용하기 적절하다. 가변길이에 적합
 * StringBilder 객체: muterble객체로써 크기를 변경할 수 있다. ==> 동기화 여부가 불분명, 가변길이에 적합
 * 
 * 성능 : StringBuilder > StringBuffer >>> String
 * 
 * Thread를 배울 때 동기/비동기를 나눠질 때 ==> 순차? 꼬리물기?
 * 프론트엔드 => AJAX (대표적인 비동기) 
 * TSS =>시분할 방식 ==> Cpu가 작업할 일을 쪼개서 사용함 
 * =>작업이 CPU를 독점하는 것처럼 사용하는 것을 TSS라고 한다.
 */


public class T10_Stringbuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1.str : "+ str );
		
		str += "/홍길동2 ";
		System.out.println("2.str : "+ str); 
		
		// capacity() : 현재 버퍼의 크기를 알아낸다.
//		str.capacity();
		
		//StringBuffer()객체 : 가변길이클래스로서 기본크기는__, 자료가 넘치면 상황에 따라서 크기를 변경처리한다.
		//append: 값을 추가. insert:버퍼에 값을 삽입, 중간에 값을 삽입할 수 있다 , delete:특정 위치의 값을 지정한 개수만큼 지운다., replace: 값을 치환
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2버퍼크기 : "+ str2.capacity()); 
//		str2 = "fddfd"; //X
		str2.append("atom");
		System.out.println("4.str2 : "+ str2); 
		System.out.println("5.str2버퍼크기 : "+ str2.capacity()); 
		str2.append("123456789012345");
		System.out.println("4.str2 : "+ str2); 
		System.out.println("5.str2버퍼크기 : "+ str2.capacity()); 
		
		str2.insert(2,"abcdefg");
		System.out.println("8.str2 : "+ str2); 
		System.out.println("9.str2버퍼크기 : "+ str2.capacity()); 
		
		str2.delete(5,20); //용량이 줄어들지 않음 => mutable임
		System.out.println("10.str2 : "+ str2); 
		System.out.println("11.str2버퍼크기 : "+ str2.capacity()); 
	}
}
