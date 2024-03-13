package api1_Object;

public class T1_hashCode1 {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "김말숙";
		String s4 = new String("홍길동");
		String s5 = new String("홍길동");
		
		
		if(s1 == s2) System.out.println("s1과 s2가 같습니다"); //같음 주소를 가리키고 있다.
		else System.out.println("s1과 s2가 다릅니다");
		System.out.println();
		
		if(s1 == s3 ) System.out.println("s1과 s3가 같습니다"); 
		else System.out.println("s1과 s3가 다릅니다");
		System.out.println();
		
		if(s1 == s4 ) System.out.println("s1과 s4가 같습니다");
		else System.out.println("s1과 s4가 다릅니다");
		System.out.println();
		
		if(s4 == s5 ) System.out.println("s4과 s5가 같습니다"); 
		else System.out.println("s4과 s5가 다릅니다");
		System.out.println();
		
		
		if(s1.equals(s4) ) System.out.println("s1과 s4가 같습니다"); //값을 비교
		else System.out.println("s1과 s4가 다릅니다");
		System.out.println();
		
		if(s4.equals(s5) ) System.out.println("s4과 s5가 같습니다"); 
		else System.out.println("s4과 s5가 다릅니다");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//해쉬코드

		System.out.println("11(hashCode) => s1 : " + s1.hashCode()+", s2 : " + s2.hashCode()); //hashCode는 숫자로 리턴 String 타입
		System.out.println("12(hashCode) => s1 : " + s1.hashCode()+", s3 : " + s3.hashCode());
		System.out.println("13(hashCode) => s1 : " + s1.hashCode()+", s4 : " + s4.hashCode()); //s4는 새로운 객체인데 값이 같다.
		System.out.println("14(hashCode) => s4 : " + s4.hashCode()+", s5 : " + s5.hashCode()); //그리고 s5도 새로운 객체인데 값이 같다.
		System.out.println();
	//해쉬코드는 주소값이 아니라 객체속성(데이터)이 같다는 뜻이다.
	
	}
}
